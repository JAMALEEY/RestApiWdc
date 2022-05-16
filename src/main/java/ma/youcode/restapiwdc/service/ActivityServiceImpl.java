package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.exercice.ActivityDto;
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
    public ActivityDto add(ActivityDto activityDto) {
        return activityRepository.save(activityDto);
    }

    @Override
    public ActivityDto update(ActivityDto activityDto) {
        return activityRepository.save(activityDto);
    }

    @Override
    public Boolean delete(ActivityDto activityDto) {
        try {
            activityRepository.delete(activityDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<ActivityDto> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public ActivityDto findById(Long activityId) {
        return activityRepository.findById(activityId).get();
    }
}
