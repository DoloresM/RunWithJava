package io.newarkjoggers.runners.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//annotation to indicate it's a REST controller - which inherently expects JSON response body
@RestController
public class RunController {

    //indicating which type of rest controller and rout(web page) to execute code on
    @GetMapping("/hello")
    String home(){
        return "Hello, Newark Joggers!";
    };

}
