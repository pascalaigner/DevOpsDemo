package ch.zhaw.iwi.devops.emailvalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testEmailContainingAtSymbol() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertTrue(emailValidator.isValid("pascal@aigner.ch"));
    }

    @Test
    public void testNullEmail() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertFalse(emailValidator.isValid(null));
    }

    @Test
    public void testEmptyEmail() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertFalse(emailValidator.isValid(""));
    }

    @Test
    public void testEmailWithDomain() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertFalse(emailValidator.isValid("pascal@"));
    }

    @Test
    public void testEmailWithDotInDomain() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertFalse(emailValidator.isValid("pascal@aignerch"));
    }

    @Test
    public void testEmailWithSpace() {
        EmailValidator emailValidator = new EmailValidator();
        Assertions.assertFalse(emailValidator.isValid("pascal@ aigner.ch"));
    }
}