package io.newarkjoggers.runners.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

//CREATING AN OBJECT W/ DATA VALIDATION MECHANISMS
public record Run(

        //validation annotations allow for requsting information about the fields validity (whereas constructor validator will always execute)
        Integer id,
        // using annotation from spring-boot-starter-validation dependency to require title field
        @NotEmpty
        String title,
        LocalDateTime startedOn,
        LocalDateTime  completedOn,
        // using annotation from spring-boot-starter-validation dependency to require positive mile integer
        @Positive
        Integer miles,
        Location location

) {
//HANDLING DATA VALIDATION by creating custome contraints w/in the record's constructor, which get called w/ every instance of a run generated
    public Run{
        if(!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Completed on must be after Started On");
        }
    }


}



