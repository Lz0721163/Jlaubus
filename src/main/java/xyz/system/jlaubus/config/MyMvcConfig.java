package xyz.system.jlaubus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.system.jlaubus.Utils.LoginHandlerInterceptor;
import xyz.system.jlaubus.Utils.MylocalResolver;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送 / 请求来到 login
        registry.addViewController("/").setViewName("mng/login");
        registry.addViewController("/index.html").setViewName("/mng/login");
        registry.addViewController("/index.html").setViewName("index");
    }

    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 静态资源 *.css *.js
        // SpringBoot已经做好了静态资源映射
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/index.html","/","/mng/login","/css/**","/font-awesome/**","/images/**","/js/**","/webjars/**");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MylocalResolver();
    }


}
