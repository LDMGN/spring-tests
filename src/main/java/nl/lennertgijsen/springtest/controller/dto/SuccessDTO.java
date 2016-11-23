package nl.lennertgijsen.springtest.controller.dto;

import com.sun.net.httpserver.Authenticator;

/**
 * Created by Lennert on 2016-11-23.
 */
public class SuccessDTO {
    private final String message;

    public SuccessDTO(final String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
