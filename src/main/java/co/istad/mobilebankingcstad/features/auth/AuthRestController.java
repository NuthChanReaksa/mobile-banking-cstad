package co.istad.mobilebankingcstad.features.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthRestController {

    @PostMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/refresh-token")
    public String refreshToken() {
        return "refreshToken";
    }

    @PostMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/logout")
    public String logout() {
        return "logout";
    }
}
