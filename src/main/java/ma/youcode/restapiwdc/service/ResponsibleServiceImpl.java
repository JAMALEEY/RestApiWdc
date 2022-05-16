package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.ResponsibleDto;
import ma.youcode.restapiwdc.repository.ResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ResponsibleServiceImpl implements ResponsibleService{
    @Autowired
    ResponsibleRepository responsibleRepository;
    @Override
    public ResponsibleDto add(ResponsibleDto responsibleDto) {
        return responsibleRepository.save(responsibleDto);
    }

    @Override
    public ResponsibleDto update(ResponsibleDto responsibleDto) {
        return responsibleRepository.save(responsibleDto);
    }

    @Override
    public Boolean delete(ResponsibleDto responsibleDto) {
        try {
            responsibleRepository.delete(responsibleDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<ResponsibleDto> findAll() {
        return responsibleRepository.findAll();
    }

    @Override
    public ResponsibleDto findById(Long responsibleId) {
        return responsibleRepository.findById(responsibleId).get();
    }
}
