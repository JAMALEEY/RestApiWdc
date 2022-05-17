package ma.youcode.restapiwdc.controler;

import ma.youcode.restapiwdc.entity.Activity;
import ma.youcode.restapiwdc.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/activity")
@ResponseBody

public class ActivityController {
    @Autowired
    private ActivityService activityService;


    @GetMapping("/")
    public List<Activity> findAll(){
        return activityService.findAll();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Activity> findById(@PathVariable("idActivity") Long idActivity){
        try {
            return ResponseEntity.status(HttpStatus.FOUND).body(activityService.findById(idActivity));
        }catch (NoSuchElementException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PutMapping("/update/{id}")
    public Activity update(@RequestBody Activity activity,@PathVariable("idActivity") Long idActivity){
        activity.setIdActivity(idActivity);
        return activityService.update(activity);
    }

    @PostMapping("/add")
    public Activity save(@RequestBody Activity activity){
        return activityService.add(activity);
    }

    @DeleteMapping("/delete")
    public Boolean delete(Activity activity){
        return activityService.delete(activity);
    }
}
