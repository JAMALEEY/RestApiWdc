package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleTypeDto;
import ma.youcode.restapiwdc.entity.ResponsibleType;
import org.springframework.stereotype.Component;

@Component
public class ResponsibleTypeMapper {
    public static ResponsibleTypeDto responsibleTypeDto (ResponsibleType responsibleType) {
        return new ResponsibleTypeDto()
                .setResponsibleType(responsibleType.getResponsibleType())
                .setId(responsibleType.getId());
    }
}
