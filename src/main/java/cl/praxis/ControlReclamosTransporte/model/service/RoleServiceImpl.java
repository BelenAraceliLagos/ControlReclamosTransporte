package cl.praxis.ControlReclamosTransporte.model.service;

import cl.praxis.ControlReclamosTransporte.model.entities.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role findOne(int id) {
        return null;
    }

    @Override
    public boolean create(Role r) {
        return false;
    }

    @Override
    public boolean update(Role r) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
