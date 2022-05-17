package ma.youcode.restapiwdc.service;

import lombok.AllArgsConstructor;
import ma.youcode.restapiwdc.entity.User;
import ma.youcode.restapiwdc.repository.UserRepository;
import ma.youcode.restapiwdc.security.UserSecurity;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userEntity = userRepository.findByEmail(username);

        if ("secret".equals(username)) {
            User user = new User();
            BeanUtils.copyProperties(
                    userEntity, user);
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return null;
    }
}
