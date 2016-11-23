package nl.lennertgijsen.springtest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Lennert on 2016-11-23.
 */
@ControllerAdvice
public class ControllerExceptionAdvice {
    @ExceptionHandler
    public ExceptionDTO handleException(final GeneralTestApplicationException exception, final HttpServletResponse response) {
        if (exception instanceof GeneralTestApplicationException) {
            response.setStatus(exception.getClass().getAnnotation(ResponseStatus.class).value().value());
            return new ExceptionDTO(exception.getApplicationCode(), exception.getMessage());
        }
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ExceptionDTO();
    }
}
