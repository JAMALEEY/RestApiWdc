//package ma.youcode.restapiwdc.security;
//
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import ma.youcode.restapiwdc.dto.model.user.UserDto;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
//@ToString
//@Getter
//@Setter
//public class UserSecurity implements UserDetails {
//    private final UserDto userDto;
//
//    public UserSecurity(final UserDto userDto) {
//        this.userDto = userDto;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userDto.getRoles().getRoleName());
//        return List.of(authority);
//    }
//
//    @Override
//    public String getPassword() {
//        return userDto.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return userDto.getLogin();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
