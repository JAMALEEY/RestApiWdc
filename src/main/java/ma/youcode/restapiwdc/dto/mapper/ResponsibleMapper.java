package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleDto;
import ma.youcode.restapiwdc.entity.Responsible;
import org.springframework.stereotype.Component;

@Component
public class ResponsibleMapper {
    public static ResponsibleDto responsibleDto (Responsible responsible) {
        return new ResponsibleDto()
                .setIdResponsible(responsible.getIdUser())
                .setResposibleDomain(responsible.getResposibleDomain());
    }
}
