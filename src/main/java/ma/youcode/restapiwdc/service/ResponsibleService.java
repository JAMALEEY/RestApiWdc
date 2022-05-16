package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleDto;

import java.util.List;

public interface ResponsibleService {
    ResponsibleDto add(ResponsibleDto responsibleDto);
    ResponsibleDto update(ResponsibleDto responsibleDto);
    Boolean delete(ResponsibleDto responsibleDto);
    List<ResponsibleDto> findAll();
    ResponsibleDto findById(Long responsibleId);
}
