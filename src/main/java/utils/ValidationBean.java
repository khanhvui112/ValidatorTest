package utils;

import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;

/**
 * @author hoabt2
 *
 */
public class ValidationBean {

//    create message alert error for user
    private String message;
    private boolean success;



    public ValidationBean(String message) {
        //success
        super();
        this.message = message;
        this.success = true;
    }

    public ValidationBean(Set<? extends ConstraintViolation<?>> violations) {
        // failed

//        assign success = false
        this.success = false;
        this.message = violations.stream()
                .map(msg -> msg.getMessage())
//                noi chuoi
                .collect(Collectors.joining(" ------ "));

    }


    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }
    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }
    @Override
    public String toString() {
        return "ValidationBean [message=" + message + ", success=" + success + "]";
    }
}
