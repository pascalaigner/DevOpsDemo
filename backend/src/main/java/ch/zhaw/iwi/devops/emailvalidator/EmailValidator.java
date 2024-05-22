package ch.zhaw.iwi.devops.emailvalidator;

public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.contains("@");
    }
}