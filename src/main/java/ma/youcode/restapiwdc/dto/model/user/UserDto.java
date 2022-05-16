package ma.youcode.restapiwdc.dto.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import ma.youcode.restapiwdc.entity.Role;

import java.util.List;
//import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class UserDto {

    private Long idUser;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String phoneNumber;
    private String email;
    private Boolean status;
    private Role roles;


}
