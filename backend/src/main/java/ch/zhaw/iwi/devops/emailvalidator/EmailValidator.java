package ch.zhaw.iwi.devops.emailvalidator;

public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        if (email.contains(" ")) {
            return false;
        }
        int atPosition = email.indexOf('@');
        int dotPosition = email.lastIndexOf('.');
        return atPosition > 0 && dotPosition > atPosition && dotPosition < email.length() - 1;
    }
}