package ma.youcode.restapiwdc.service;

import ma.youcode.restapiwdc.entity.User;
import ma.youcode.restapiwdc.repository.ParticipantRepository;
import ma.youcode.restapiwdc.repository.ResponsibleRepository;
import ma.youcode.restapiwdc.repository.RoleRepository;
import ma.youcode.restapiwdc.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import java.util.List;


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
//    public TreeSet<User> findAll() {
//        return userRepository.findAll()
//                .stream()
//                .map(user -> modelMapper.map(user, User.class))
//                .collect(Collectors.toCollection(TreeSet::new));
//    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();

    }

    @Override
    public User login(User user) {
        return userRepository.findByEmail(user.getEmail());
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

//    @Override
//    public User add(User user) {
//        User admin = getUser(user.getEmail());
//        if (admin != null) {
//            Optional<User> user = Optional.ofNullable(
//                    userRepository.findByEmail(user.getEmail()));
//            if (!user.isPresent()) {
//                return new User()
//                        .setFirstName(user.getFirstName())
//                        .setLastName(user.getLastName()
//                        ;
//                userRepository.save(userModel);
//                return modelMapper.map(userModel, User.class);
//            }
//return null;
//        }
//        return user;
//    }


    @Override
    public User findUserById(Long userId) {
//        return userRepository.findById(String.valueOf(userId)).get();
        return userRepository.findById(userId).get();


    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User changePassword(User user, String newPassword) {
        return userRepository.findByEmail(user.getEmail());

    }

    @Override
    public Boolean delete(User user) {
        try {
            userRepository.delete(user);
            return true;
        }catch (DataAccessException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private User getUser(String email) {
        return userRepository.findByEmail(email);
    }

}
