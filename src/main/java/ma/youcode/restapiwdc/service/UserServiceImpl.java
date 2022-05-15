package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.UserDto;
import ma.youcode.restapiwdc.entity.User;
import ma.youcode.restapiwdc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto findOne(Long userId) {
        <User> user = userRepository.findOne(userId);
//        return userRepository.findOne(userId);
    }

    @Override
    public UserDto add(UserDto user) {
        return null;
    }

    @Override
    public UserDto update(UserDto user) {
        return null;
    }

    @Override
    public Boolean delete(UserDto user) {
        return null;
    }
}
