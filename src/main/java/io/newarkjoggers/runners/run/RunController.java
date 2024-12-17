package io.newarkjoggers.runners.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//annotation to indicate it's a REST controller - which inherently expects JSON response body
@RestController

// declaring a default path for all request endpoints
@RequestMapping("/api/runs")

// CRUD class
public class RunController {

    //declaring instance of object/data
    private final RunRepository runRepository;

    //creating constructor and injecting data when class created
    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }

    //indicating which type of rest controller and rout(web page) to execute code on
    @GetMapping("")
    List<Run> findAll() {
        return runRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id){
        Optional<Run> run = runRepository.findById(id);
        if(run.isEmpty()){
            throw new RunNotFoundException();
        }
        return run.get();
    }

    // POST
    // annotation indicating to send back the status of the HTTP request to how post created
    @ResponseStatus(HttpStatus.CREATED)
    //post route, sending a body to the server w/RequestBody annotation
    @PostMapping()
    void create(@RequestBody Run run){
        runRepository.create(run);
    }

    //PUT
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@RequestBody Run run, @PathVariable Integer id){
        runRepository.update(run,id);
    }

    //DELETE
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        runRepository.delete(id);
    }







}
