package ma.youcode.restapiwdc.service;


import ma.youcode.restapiwdc.dto.model.exercice.ActivityDto;

import java.util.List;

public interface ActivityService {
    ActivityDto add(ActivityDto activityDto);
    ActivityDto update(ActivityDto activityDto);
    Boolean delete(ActivityDto activityDto);
    List<ActivityDto> findAll();
    ActivityDto findById(Long activityId);
}
