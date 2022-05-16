package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.ParticipantDto;
import ma.youcode.restapiwdc.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

public class ParticipantServiceImpl implements ParticipantService{
    @Autowired
    ParticipantRepository participantRepository;
    @Override
    public ParticipantDto add(ParticipantDto participantDto) {
        return participantRepository.save(participantDto);
    }

    @Override
    public ParticipantDto update(ParticipantDto participantDto) {
        return participantRepository.save(participantDto);
    }

    @Override
    public Boolean delete(ParticipantDto participantDto) {
        try {
            participantRepository.delete(participantDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<ParticipantDto> findAll() {
        return participantRepository.findAll();
    }

    @Override
    public ParticipantDto findById(Long participantId) {
        return participantRepository.findById(participantId).get();
    }
}
