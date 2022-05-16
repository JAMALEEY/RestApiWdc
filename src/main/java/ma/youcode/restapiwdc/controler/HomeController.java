package ma.youcode.restapiwdc.controler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public List<String> hello(){
        return  List.of("This is ","home controller");
    }
}
