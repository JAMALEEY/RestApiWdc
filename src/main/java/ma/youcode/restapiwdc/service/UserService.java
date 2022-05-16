package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.UserDto;

import java.util.List;


public interface UserService {


    UserDto login(UserDto userDto);
    UserDto add(UserDto userDto);
    UserDto update(UserDto userDto);
    Boolean delete(UserDto userDto);
    List<UserDto> findAll();
    UserDto findUserById(Long userId);
    UserDto changePassword(UserDto userDto, String newPassword);







//
//    UserDto adminAuth(UserDto userDto);
//    UserDto login(UserDto userDto);
//    UserDto findUserByCategory(String Category);
//    UserDto findUserById(Long userId);
//    List<UserDto> findAllUsers();
//    List<UserDto> findAllParticipant();
//
//    UserDto createUser(UserDto userDto);
//    UserDto updateUser(UserDto userDto);
//    UserDto deleteUser(UserDto userDto);



}
