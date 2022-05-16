package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.RoleDto;
import ma.youcode.restapiwdc.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleDto add(RoleDto roleDto) {
        return roleRepository.save(roleDto);
    }

    @Override
    public RoleDto update(RoleDto roleDto) {
        return roleRepository.save(roleDto);
    }

    @Override
    public Boolean delete(RoleDto roleDto) {
        try {
            roleRepository.delete(roleDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }    }

    @Override
    public List<RoleDto> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public RoleDto findById(Long roleId) {
        return roleRepository.findById(roleId).get();
    }
}
