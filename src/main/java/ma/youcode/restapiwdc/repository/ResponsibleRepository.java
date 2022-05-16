package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleDto;
import ma.youcode.restapiwdc.entity.Responsible;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsibleRepository extends JpaRepository<ResponsibleDto, String> {
}
