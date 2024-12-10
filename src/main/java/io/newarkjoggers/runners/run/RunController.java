package io.newarkjoggers.runners.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//annotation to indicate it's a REST controller - which inherently expects JSON response body
@RestController
public class RunController {

    //declaring instance of object/data
    private final RunRepository runRepository;

    //creating constructor and injecting data when class created
    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }

    //indicating which type of rest controller and rout(web page) to execute code on
    @GetMapping("/api/runs")
    Run findAll() {

        return runRepository.findAll();
    }

}
