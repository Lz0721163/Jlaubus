package xyz.system.jlaubus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.system.jlaubus.entity.Manager;
import xyz.system.jlaubus.mapper.ManagerMapper;

@SpringBootTest
class JlaubusApplicationTests {

    @Autowired
    private ManagerMapper managerMapper;
    @Test
    void contextLoads() {
        Manager m = managerMapper.getManagerById("1812100313");
        System.out.println(m);
    }
}
