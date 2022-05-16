package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.dto.model.user.RoleDto;
import ma.youcode.restapiwdc.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleDto, Long> {
//    Role findByRole(String role);

}
