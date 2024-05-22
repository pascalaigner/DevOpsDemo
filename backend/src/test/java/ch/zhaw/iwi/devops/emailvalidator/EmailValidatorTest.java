package ch.zhaw.iwi.devops.emailvalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testEmailContainingAtSymbol() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertTrue(emailValidator.isValid("pascal@aigner.ch"));
    }
}