package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.ResponsibleType;

import java.util.List;

public interface ResponsibleTypeService {
    ResponsibleType add(ResponsibleType responsibleType);
    ResponsibleType update(ResponsibleType responsibleType);
    Boolean delete(ResponsibleType responsibleType);
    List<ResponsibleType> findAll();
    ResponsibleType findById(Long responsibleTypeId);
}
