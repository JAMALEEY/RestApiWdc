package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.RoleDto;

import java.util.List;

public interface RoleService {
    RoleDto add(RoleDto roleDto);
    RoleDto update(RoleDto roleDto);
    Boolean delete(RoleDto roleDto);
    List<RoleDto> findAll();
    RoleDto findById(Long roleDto);
}
