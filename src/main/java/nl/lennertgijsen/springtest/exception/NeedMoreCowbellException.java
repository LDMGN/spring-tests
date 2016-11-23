package nl.lennertgijsen.springtest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Lennert on 2016-11-23.
 */
@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class NeedMoreCowbellException extends RuntimeException implements GeneralTestApplicationException {
    public NeedMoreCowbellException(final String message) {
       super(message);
    }

    public int getApplicationCode() {
        return 123;
    }
}
