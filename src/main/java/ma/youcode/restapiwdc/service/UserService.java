package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.entity.User;

import java.util.List;


public interface UserService {


    User login(User user);
    User add(User user);
    User update(User user);
    Boolean delete(User user);
    List<User> findAll();
    User findUserById(Long userId);
    User changePassword(User user, String newPassword);







//
//    User adminAuth(User user);
//    User login(User user);
//    User findUserByCategory(String Category);
//    User findUserById(Long userId);
//    List<User> findAllUsers();
//    List<User> findAllParticipant();
//
//    User createUser(User user);
//    User updateUser(User user);
//    User deleteUser(User user);



}
