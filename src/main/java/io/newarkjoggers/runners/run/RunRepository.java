package io.newarkjoggers.runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    // create a list to hold all run objects/ sessions
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }



    @PostConstruct // allows for these methods to get called/ initiate the data, creating a list.
    private void init() {
        runs.add(new Run( 1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.INDOOR));
        runs.add(new Run( 2,
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6,
                Location.INDOOR));
    }


}
