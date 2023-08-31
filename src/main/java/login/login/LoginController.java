package login.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoginController {

    @GetMapping("/login/api/vi-manager")
    public ResponseEntity<String> getManagerLogin(){
        RestTemplate template = new RestTemplate();
        return ResponseEntity.ok("welcome to the login page");
    }

    @GetMapping("/login/api/vi-admin")
    public ResponseEntity<String> getAdminLogin(){
        return ResponseEntity.ok("welcome to the login page");
    }

    @GetMapping("/login/api/vi-user")
    public ResponseEntity<String> getUserLogin(){
        return ResponseEntity.ok("welcome to the login page");
    }
}
