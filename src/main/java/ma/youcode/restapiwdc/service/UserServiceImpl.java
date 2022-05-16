package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.dto.model.user.UserDto;
import ma.youcode.restapiwdc.entity.User;
import ma.youcode.restapiwdc.repository.ParticipantRepository;
import ma.youcode.restapiwdc.repository.ResponsibleRepository;
import ma.youcode.restapiwdc.repository.RoleRepository;
import ma.youcode.restapiwdc.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service

@Component
public class UserServiceImpl implements UserService {

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ParticipantRepository participantRepository;
    @Autowired
    private ResponsibleRepository responsibleRepository;
    @Autowired
    private ModelMapper modelMapper;

//    @Override
//    public TreeSet<UserDto> findAll() {
//        return userRepository.findAll()
//                .stream()
//                .map(user -> modelMapper.map(user, UserDto.class))
//                .collect(Collectors.toCollection(TreeSet::new));
//    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll();

    }

    @Override
    public UserDto login(UserDto userDto) {
        return userRepository.findByEmail(userDto.getEmail());
    }

    @Override
    public UserDto add(UserDto userDto) {
        return userRepository.save(userDto);
    }

//    @Override
//    public UserDto add(UserDto userDto) {
//        User admin = getUser(userDto.getEmail());
//        if (admin != null) {
//            Optional<User> user = Optional.ofNullable(
//                    userRepository.findByEmail(userDto.getEmail()));
//            if (!user.isPresent()) {
//                return new User()
//                        .setFirstName(userDto.getFirstName())
//                        .setLastName(userDto.getLastName()
//                        ;
//                userRepository.save(userModel);
//                return modelMapper.map(userModel, UserDto.class);
//            }
//return null;
//        }
//        return userDto;
//    }


    @Override
    public UserDto findUserById(Long userId) {
//        return userRepository.findById(String.valueOf(userId)).get();
        return userRepository.findById(userId).get();


    }

    @Override
    public UserDto update(UserDto userDto) {
        return userRepository.save(userDto);
    }

    @Override
    public UserDto changePassword(UserDto userDto, String newPassword) {
        return userRepository.findByEmail(userDto.getEmail());

    }

    @Override
    public Boolean delete(UserDto userDto) {
        try {
            userRepository.delete(userDto);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private UserDto getUser(String email) {
        return userRepository.findByEmail(email);
    }

}
