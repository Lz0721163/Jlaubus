package xyz.system.jlaubus.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.system.jlaubus.Service.IManagerService;
import xyz.system.jlaubus.entity.Manager;
import xyz.system.jlaubus.mapper.ManagerMapper;

import java.util.List;
@Service
public class ManagerService implements IManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager getManager(String mid, String password) {
        return managerMapper.getManager(mid,password);
    }

    @Override
    public Manager getManagerById(String mid) {
        return managerMapper.getManagerById(mid);
    }

    @Override
    public List<Manager> getAllManagers() {

        return managerMapper.getAllManagers();
    }

    @Override
    public int deleteManagerById(String mid) {

        return managerMapper.deleteManagerById(mid) ;
    }

    @Override
    public int addManager(Manager manager) {

        return managerMapper.addManager(manager);
    }

    @Override
    public int updateManager(Manager manager) {

        return managerMapper.updateManager(manager);
    }
}
