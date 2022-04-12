package xyz.system.jlaubus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.system.jlaubus.Service.IManagerService;
import xyz.system.jlaubus.entity.Manager;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ManagerController {

    @Autowired
    private IManagerService managerService;

    @RequestMapping(value = "/mng/login")
    public String login(String mid, String password, HttpSession session,
                        Model model){
//        根据用户名和密码进行登录校验
        Manager m = managerService.getManager(mid,password);

        if(m!=null) {
//        登录成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("MNG_SESSION",m);
            return "redirect:/index";

        } else {
//            登录失败，
            model.addAttribute("msg","账号或密码错误，请重新输入！");
            return "/mng/login";
        }

    }

    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout(){
        return "/mng/login";
    }
}
