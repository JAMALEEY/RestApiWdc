package ma.youcode.restapiwdc.controler;

import lombok.AllArgsConstructor;
import ma.youcode.restapiwdc.security.AuthRequest;
import ma.youcode.restapiwdc.service.UserDetailService;
import ma.youcode.restapiwdc.utils.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
@AllArgsConstructor
public class LoginController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private UserDetailService userDetailsService;

    @PostMapping("/authenticate")
    public ResponseEntity<Map<String, Object>> authenticate(@RequestBody AuthRequest authRequest) {
        String login = authRequest.getLogin();
        String password = authRequest.getPassword();
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login, password));
        final UserDetails userDetails = userDetailsService.loadUserByUsername(login);
        return ResponseEntity.ok().body(Map.of("token", jwtUtil.generateToken(userDetails), "user", userDetails));
    }
}
