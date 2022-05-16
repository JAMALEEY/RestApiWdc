package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.Responsible;
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
    public Responsible add(Responsible responsible) {
        return responsibleRepository.save(responsible);
    }

    @Override
    public Responsible update(Responsible responsible) {
        return responsibleRepository.save(responsible);
    }

    @Override
    public Boolean delete(Responsible responsible) {
        try {
            responsibleRepository.delete(responsible);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Responsible> findAll() {
        return responsibleRepository.findAll();
    }

    @Override
    public Responsible findById(Long responsibleId) {
        return responsibleRepository.findById(responsibleId).get();
    }
}
