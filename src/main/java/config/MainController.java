package config;

/**
 * Created by user on 30.11.16.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping("/test")
    public String testRequest() {

        return "Success test";
    }

}
