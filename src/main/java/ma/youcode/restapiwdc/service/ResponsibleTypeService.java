package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleTypeDto;

import java.util.List;

public interface ResponsibleTypeService {
    ResponsibleTypeDto add(ResponsibleTypeDto responsibleTypeDto);
    ResponsibleTypeDto update(ResponsibleTypeDto responsibleTypeDto);
    Boolean delete(ResponsibleTypeDto responsibleTypeDto);
    List<ResponsibleTypeDto> findAll();
    ResponsibleTypeDto findById(Long responsibleTypeId);
}
