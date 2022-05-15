package ma.youcode.restapiwdc.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import ma.youcode.restapiwdc.entity.ActivityStatus;

import java.util.Date;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class ActivityDto {
    private Long idActivity;
    private String activityName;
    private String activityDescription;
    private String activityType;
    private Date activityStart;
    private Date activityEnd;
    private ActivityStatus activityStatus;


}
