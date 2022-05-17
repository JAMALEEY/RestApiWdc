//package ma.youcode.restapiwdc.config;
//
//import ma.youcode.restapiwdc.security.filter.JwtFilter;
//import ma.youcode.restapiwdc.config.JwtAuthenticationEntryPoint;
//import ma.youcode.restapiwdc.service.UserDetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebSecurity
//public class JwtConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailService userDetailService;
//
//    @Autowired
//    private JwtFilter jwtFilter;
//
//    @Autowired
//    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
//
//
//    // what is our auth mode (how to manage our auth process)
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
//
//    }
//
//
//    // this method allow  us to control which endpoint is permited and which arent
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .cors().and().csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api/login" ,"/api/register", "/h2-console/**").permitAll() //permession to access publically this endpoints
//                .anyRequest().authenticated() //other requests besides generateToken are conditioned to authentication
//                .and()
////                exception handling
//                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
////                .authorizeRequests().antMatchers("/api/roles").permitAll()
////                .and()
////                .authorizeRequests().antMatchers("/h2_console/**").permitAll()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); //the requests are independent regarding each other, the server dont manage the session
//
//        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//
//
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        // not for production !
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception{
//        return super.authenticationManagerBean();
//    }
//}
