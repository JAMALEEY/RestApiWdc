package ma.youcode.restapiwdc.dto.mapper;

import ma.youcode.restapiwdc.dto.model.role.RoleDto;
import ma.youcode.restapiwdc.dto.model.user.UserDto;
import ma.youcode.restapiwdc.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

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