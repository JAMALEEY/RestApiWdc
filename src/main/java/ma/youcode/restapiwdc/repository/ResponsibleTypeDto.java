package ma.youcode.restapiwdc.repository;

import ma.youcode.restapiwdc.entity.ResponsibleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsibleTypeDto extends JpaRepository<ResponsibleType, String> {
}