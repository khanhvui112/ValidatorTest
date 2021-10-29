package utils;

import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import entity.EmployeeBean;
import entity.Student;
import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.hibernate.validator.resourceloading.AggregateResourceBundleLocator;


/**
 * @author hoabt2
 */
public class BeanValidatorUtils {


    /**
     * @param obj
     */
    public static ValidationBean validateBean(Object obj) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(obj);
        if (violations.isEmpty()) {
            return new ValidationBean("Your bean is ok");
        } else {
            return new ValidationBean(violations);
        }
    }

    //    load message new
    public static Validator initResourceProperties() {
        Validator validator = Validation.byDefaultProvider()
                .configure()
                .messageInterpolator(new ResourceBundleMessageInterpolator(
                        new AggregateResourceBundleLocator(
                                Arrays.asList("messages.properties")
                        )

                ))
                .buildValidatorFactory()
                .getValidator();
        System.out.println("Load message student new: " + validator.getConstraintsForClass(Student.class).getConstraintsForProperty("name"));
        System.out.println("Load message new: " + validator.getConstraintsForClass(EmployeeBean.class));
        return validator;
    }

}