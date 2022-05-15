package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.user.UserDto;
import ma.youcode.restapiwdc.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto()
                .setIdUser(user.getIdUser())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setLogin(user.getLogin())
                .setPassword(user.getPassword())
                .setPhoneNumber(user.getPhoneNumber())
                .setEmail(user.getEmail())
                .setStatus(user.getStatus())
                .setRoles(user.getRoles());

    }
}