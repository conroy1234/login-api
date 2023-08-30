package login.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails jane = User.builder()
                .username("Jane")
                .password("{noop}password1")
                .roles("EMPLOYEE")
                .build();

        UserDetails thomas = User.builder()
                .username("Thomas")
                .password("{noop}password1")
                .roles("EMPLOYEE","MANAGER")
                .build();

        UserDetails suzie = User.builder()
                .username("Suzie")
                .password("{noop}password1")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(jane,thomas,suzie);
    }
}
