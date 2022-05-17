package ma.youcode.restapiwdc.controler;

import ma.youcode.restapiwdc.entity.Responsible;
import ma.youcode.restapiwdc.service.ResponsibleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsible")
public class ResponsibleController {
    @Autowired
    ResponsibleService responsibleService;

    @GetMapping("/")
    public List<Responsible> getAll(){
        return responsibleService.findAll();
    }

    @GetMapping("/find/{id}")
    public Responsible find(@PathVariable("id") Long id){
        return responsibleService.findById(id);
    }

    @PutMapping("/update/{id}")
    public Responsible update(@RequestBody Responsible responsible,@PathVariable("id") Long id){
        responsible.setIdUser(id);
        return responsibleService.update(responsible);
    }

    @PostMapping("/add")
    public Responsible store(@RequestBody Responsible responsible){
        return responsibleService.add(responsible);
    }

    @DeleteMapping("/delete")
    public Boolean delete(@RequestBody  Responsible responsible){
        return responsibleService.delete(responsible);
    }

    @PostMapping("/login")
    public Responsible login(@RequestBody Responsible responsible){
        return responsibleService.login(responsible);
    }

    @PostMapping("/password/reset")
    public Responsible resetPassword(@RequestBody Responsible responsible){
        return responsibleService.forgetPassword(responsible);
    }
}

