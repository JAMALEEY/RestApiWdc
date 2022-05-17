package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.exercice.ActivityDto;
import ma.youcode.restapiwdc.entity.Activity;
import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {
    public static ActivityDto activityDto(Activity activity){
        return new ActivityDto()
                .setIdActivity(activity.getIdActivity())
                .setActivityDescription(activity.getActivityDescription())
                .setActivityEnd(activity.getActivityEnd())
                .setActivityName(activity.getActivityName())
                .setActivityStart(activity.getActivityStart())
                .setActivityStatus(activity.getActivityStatus())
                .setActivityType(activity.getActivityType());
    }
}
