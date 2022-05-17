package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.exercice.ActivityTypeDto;
import ma.youcode.restapiwdc.entity.ActivityType;

public class ActivityTypeMapper {
    public static ActivityTypeDto activityTypeDto (ActivityType activityType) {
        return new ActivityTypeDto()
                .setActivityType(activityType.getActivityType())
                .setId(activityType.getIdActivity());

    }
}
