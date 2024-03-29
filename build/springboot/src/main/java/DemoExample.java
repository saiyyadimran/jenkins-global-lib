import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class DemoExample {

    @RequestMapping("/")
    String home() {
        return "Hello World-Updated!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoExample.class, args);
    }

}
