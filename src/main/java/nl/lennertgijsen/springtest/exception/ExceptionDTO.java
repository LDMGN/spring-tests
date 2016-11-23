package nl.lennertgijsen.springtest.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Lennert on 2016-11-23.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionDTO {
    private final Integer applicationCode;
    private final String message;

    public ExceptionDTO() {
        applicationCode = null;
        message = null;
    }

    public ExceptionDTO(final int applicationCode, final String message) {
        this.applicationCode = applicationCode;
        this.message = message;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public String getMessage() {
        return message;
    }
}
