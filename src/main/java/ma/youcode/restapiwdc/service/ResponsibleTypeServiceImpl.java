package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleTypeDto;
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
    public ResponsibleTypeDto add(ResponsibleTypeDto responsibleTypeDto) {
        return responsibleTypeRepository.save(responsibleTypeDto);
    }

    @Override
    public ResponsibleTypeDto update(ResponsibleTypeDto responsibleTypeDto) {
        return responsibleTypeRepository.save(responsibleTypeDto);
    }

    @Override
    public Boolean delete(ResponsibleTypeDto responsibleTypeDto) {
        try {
            responsibleTypeRepository.delete(responsibleTypeDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }    }

    @Override
    public List<ResponsibleTypeDto> findAll() {
        return responsibleTypeRepository.findAll();
    }

    @Override
    public ResponsibleTypeDto findById(Long responsibleTypeId) {
        return responsibleTypeRepository.findById(responsibleTypeId).get();
    }
}
