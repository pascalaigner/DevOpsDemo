package ch.zhaw.iwi.devops.emailvalidator;

public class EmailValidator {

    public boolean isValid(String email) {
        return email.contains("@");
    }
}