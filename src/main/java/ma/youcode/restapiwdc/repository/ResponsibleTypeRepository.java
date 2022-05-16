package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleTypeDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsibleTypeRepository extends JpaRepository<ResponsibleTypeDto, Long> {
}
