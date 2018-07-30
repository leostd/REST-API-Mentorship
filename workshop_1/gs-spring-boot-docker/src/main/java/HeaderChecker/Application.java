package HeaderChecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @RequestMapping("/header-checker")
    public String headerChecker(@RequestHeader("Palindrome-Token") String palindromeToken) {
        List<HeaderCheckerRule> rules = new ArrayList<>();
        rules.add(new PalindromeHeaderRule());
        rules.add(new NotEmptyHeaderRule());
        rules.add(new NotNullHeaderRule());
        for (HeaderCheckerRule rule : rules){
            rule.validate(palindromeToken);
        }
        return palindromeToken;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}