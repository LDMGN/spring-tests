package nl.lennertgijsen.springtest.controller.exception;

/**
 * Created by Lennert on 2016-11-23.
 */
public interface GeneralTestApplicationException {
    int getApplicationCode();
    String getMessage();
}
