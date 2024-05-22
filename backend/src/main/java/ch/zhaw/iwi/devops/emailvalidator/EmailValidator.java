package ch.zhaw.iwi.devops.emailvalidator;

public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atPosition = email.indexOf('@');
        return atPosition > 0 && atPosition < email.length() - 1;
    }
}