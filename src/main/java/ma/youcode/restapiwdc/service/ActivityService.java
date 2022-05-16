package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.entity.Activity;
import java.util.List;

public interface ActivityService {
    Activity add(Activity activity);
    Activity update(Activity activity);
    Boolean delete(Activity activity);
    List<Activity> findAll();
    Activity findById(Long activityId);
}
