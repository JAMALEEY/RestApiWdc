package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.entity.Participant;
import ma.youcode.restapiwdc.entity.Responsible;
import java.util.List;

public interface ResponsibleService {
    Responsible add(Responsible responsible);
    Responsible update(Responsible responsible);
    Boolean delete(Responsible responsible);
    List<Responsible> findAll();
    Responsible findById(Long responsibleId);
    Responsible login(Responsible responsible);
    Responsible forgetPassword(Responsible responsible);
}
