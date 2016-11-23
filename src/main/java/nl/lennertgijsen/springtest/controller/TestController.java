package nl.lennertgijsen.springtest.controller;

import nl.lennertgijsen.springtest.controller.dto.SuccessDTO;
import nl.lennertgijsen.springtest.exception.NeedMoreCowbellException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lennert on 2016-11-23.
 */
@RestController
@RequestMapping("/api/1")
public class TestController {
    @RequestMapping
    public SuccessDTO succesful() {
        return new SuccessDTO("Foo");
    }

    @RequestMapping("/problem")
    public SuccessDTO problem() {
        throw new NeedMoreCowbellException("We need more cowbell!");
    }
}
