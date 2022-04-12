package xyz.system.jlaubus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.system.jlaubus.entity.Manager;

import java.util.List;

@Mapper
@Repository
public interface ManagerMapper {

    Manager getManager(@Param("mid") String mid,@Param("password") String password);

    Manager getManagerById(String mid);

    List<Manager> getAllManagers();

    int deleteManagerById(String mid);

    int addManager(Manager manager);

    int updateManager(Manager manager);

}
