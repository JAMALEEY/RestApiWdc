package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.user.ParticipantDto;
import ma.youcode.restapiwdc.entity.Participant;
import org.springframework.stereotype.Component;

@Component
public class ParticipantMapper {
    public static ParticipantDto participantDto (Participant participant) {
        return new ParticipantDto()
                .setIdParticipant(participant.getIdParticipant())
                .setParticipantDomain(participant.getParticipantDomain())
                .setActivity(participant.getActivity())
                .setStructure(participant.getStructure());
    }
}
