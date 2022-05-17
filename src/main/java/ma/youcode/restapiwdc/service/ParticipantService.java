package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.Participant;

import java.util.List;

public interface ParticipantService {
    Participant add(Participant participant);
    Participant update(Participant participant);
    Boolean delete(Participant participant);
    List<Participant> findAll();
    Participant findById(Long participantId);
}
