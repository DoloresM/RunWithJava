package io.newarkjoggers.runners.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// ClASS FOR RETURNING A 404 RESPONSE
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNotFoundException extends RuntimeException {
    public RunNotFoundException(){
        super("Run Not Found");
    }
}
