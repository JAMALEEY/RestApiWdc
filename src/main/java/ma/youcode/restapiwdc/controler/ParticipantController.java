package ma.youcode.restapiwdc.controler;


import ma.youcode.restapiwdc.entity.Participant;
import ma.youcode.restapiwdc.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
    @Autowired
    ParticipantService participantService;

    @GetMapping("/")
    public List<Participant> getAll(){
        return participantService.findAll();
    }

    @GetMapping("/find/{id}")
    public Participant find(@PathVariable("id") Long id){
        return participantService.findById(id);
    }

    @PutMapping("/update/{id}")
    public Participant update(@RequestBody Participant participant,@PathVariable("id") Long id){
        participant.setIdUser(id);
        return participantService.update(participant);
    }

    @PostMapping("/add")
    public Participant store(@RequestBody Participant participant){
        return participantService.add(participant);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody Participant participant){
        return participantService.delete(participant);
    }

    @PostMapping("/login")
    public Participant login(@RequestBody Participant participant){
        return participantService.login(participant);
    }

    @PostMapping("/password/reset")
    public Participant resetPassword(@RequestBody Participant participant){
        return participantService.forgetPassword(participant);
    }
}
