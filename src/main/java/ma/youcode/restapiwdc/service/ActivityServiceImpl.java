package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.entity.Activity;
import ma.youcode.restapiwdc.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class ActivityServiceImpl implements  ActivityService{

    @Autowired
    ActivityRepository activityRepository;

    @Override
    public Activity add(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity update(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Boolean delete(Activity activity) {
        try {
            activityRepository.delete(activity);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public Activity findById(Long activityId) {
        return activityRepository.findById(activityId).get();
    }
}
