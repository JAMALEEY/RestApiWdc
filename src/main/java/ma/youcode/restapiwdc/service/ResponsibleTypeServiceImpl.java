package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.ResponsibleType;
import ma.youcode.restapiwdc.repository.ResponsibleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ResponsibleTypeServiceImpl implements ResponsibleTypeService {
    @Autowired
    ResponsibleTypeRepository responsibleTypeRepository;
    @Override
    public ResponsibleType add(ResponsibleType responsibleType) {
        return responsibleTypeRepository.save(responsibleType);
    }

    @Override
    public ResponsibleType update(ResponsibleType responsibleType) {
        return responsibleTypeRepository.save(responsibleType);
    }

    @Override
    public Boolean delete(ResponsibleType responsibleType) {
        try {
            responsibleTypeRepository.delete(responsibleType);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }    }

    @Override
    public List<ResponsibleType> findAll() {
        return responsibleTypeRepository.findAll();
    }

    @Override
    public ResponsibleType findById(Long responsibleTypeId) {
        return responsibleTypeRepository.findById(responsibleTypeId).get();
    }
}
