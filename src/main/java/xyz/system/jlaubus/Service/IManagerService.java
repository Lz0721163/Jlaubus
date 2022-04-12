package xyz.system.jlaubus.Service;

import xyz.system.jlaubus.entity.Manager;

import java.util.List;

public interface IManagerService {

    Manager getManager(String mid,String password);

    Manager getManagerById(String mid);

    List<Manager> getAllManagers();

    int deleteManagerById(String mid);

    int addManager(Manager manager);

    int updateManager(Manager manager);
}
