package java_labs.Lab4.t3;

public class Main {
    public static void main(String[] args) {
        String[] emails = { "example@example.com", "invalid-email", "another.example@", "test@example" };

        for (String email : emails) {
            try {
                EmailValidator.validateEmail(email);
            } catch (CustomEmailFormatException e) {
                EmailValidator.logError(e.getMessage());
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }
}
