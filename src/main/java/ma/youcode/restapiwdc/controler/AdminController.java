package ma.youcode.restapiwdc.controler;


import ma.youcode.restapiwdc.entity.User;
import ma.youcode.restapiwdc.service.ActivityService;
import ma.youcode.restapiwdc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/admin")
@RolesAllowed("ROLE_ADMIN")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/find/{id}")
    public User find(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

    @PutMapping("/update/{id}")
    public User update(@RequestBody User user,@PathVariable("id") Long id){
        user.setIdUser(id);
        return userService.update(user);
    }

    @PostMapping("/add")
    public User store(@RequestBody User user){
        return userService.add(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@RequestBody User user){
        return userService.delete(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping("/password/reset")
    public User resetPassword(@RequestBody User user){
        return userService.changePassword(user, null);
    }
}
