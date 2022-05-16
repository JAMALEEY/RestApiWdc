package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.ParticipantDto;

import java.util.List;

public interface ParticipantService {
    ParticipantDto add(ParticipantDto participantDto);
    ParticipantDto update(ParticipantDto participantDto);
    Boolean delete(ParticipantDto participantDto);
    List<ParticipantDto> findAll();
    ParticipantDto findById(Long participantId);
}
