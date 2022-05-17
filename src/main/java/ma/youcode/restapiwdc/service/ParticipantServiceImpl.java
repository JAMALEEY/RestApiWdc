package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.entity.Participant;
import ma.youcode.restapiwdc.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ParticipantServiceImpl implements ParticipantService{
    @Autowired
    ParticipantRepository participantRepository;
    @Override
    public Participant add(Participant participantDto) {
        return participantRepository.save(participantDto);
    }

    @Override
    public Participant update(Participant participantDto) {
        return participantRepository.save(participantDto);
    }

    @Override
    public Boolean delete(Participant participantDto) {
        try {
            participantRepository.delete(participantDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    @Override
    public Participant findById(Long participantId) {
        return participantRepository.findById(participantId).get();
    }
}
