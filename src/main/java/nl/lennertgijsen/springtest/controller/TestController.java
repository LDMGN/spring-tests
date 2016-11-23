package nl.lennertgijsen.springtest.controller;

import nl.lennertgijsen.springtest.controller.dto.SuccessDTO;
import nl.lennertgijsen.springtest.controller.exception.ExceptionDTO;
import nl.lennertgijsen.springtest.controller.exception.GeneralTestApplicationException;
import nl.lennertgijsen.springtest.controller.exception.NeedMoreCowbellException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Lennert on 2016-11-23.
 */
@RestController
public class TestController {
    @RequestMapping
    public SuccessDTO succesful() {
        return new SuccessDTO("Foo");
    }

    @RequestMapping("/problem")
    public SuccessDTO problem() {
        throw new NeedMoreCowbellException("We need more cowbell!");
    }

    @ExceptionHandler(RuntimeException.class)
    public ExceptionDTO handleException(final GeneralTestApplicationException exception, final HttpServletResponse response) {
        if (exception instanceof GeneralTestApplicationException) {
            return new ExceptionDTO(exception.getApplicationCode(), exception.getMessage());
        }
        return new ExceptionDTO();
    }
}
