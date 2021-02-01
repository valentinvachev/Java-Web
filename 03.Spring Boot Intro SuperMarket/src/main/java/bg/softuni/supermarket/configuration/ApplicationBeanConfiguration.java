package bg.softuni.supermarket.configuration;

import bg.softuni.supermarket.utils.ValidationUtil;
import bg.softuni.supermarket.utils.ValidationUtilImpl;
import org.springframework.context.annotation.Bean;

import javax.validation.Validation;
import javax.validation.Validator;


public class ApplicationBeanConfiguration {

    @Bean
    public Validator validator() {
        return Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Bean
    public ValidationUtil validatorUtil() {
        return new ValidationUtilImpl(validator());
    }
}
