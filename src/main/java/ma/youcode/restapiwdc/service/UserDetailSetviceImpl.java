//package ma.youcode.restapiwdc.service;
//
//import ma.youcode.restapiwdc.dto.model.user.UserDto;
//import ma.youcode.restapiwdc.repository.UserRepository;
//import ma.youcode.restapiwdc.security.UserSecurity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class UserDetailSetviceImpl implements UserDetailsService {
//    private final UserRepository userRepository;
//
//    public UserDetailSetviceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDto userDto = userRepository.findByLogin(username).orElseThrow(() -> new UsernameNotFoundException("The user has not been found"));
//        return new UserSecurity(userDto);
//    }
//}
