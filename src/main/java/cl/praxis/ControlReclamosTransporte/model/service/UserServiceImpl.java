package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findOne(int id) {
        return null;
    }

    @Override
    public boolean create(User u) {
        return false;
    }

    @Override
    public boolean update(User u) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
