package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.entity.Role;

import java.util.List;

public interface RoleService {
    Role add(Role role);
    Role update(Role role);
    Boolean delete(Role role);
    List<Role> findAll();
    Role findById(Long roleId);
}
