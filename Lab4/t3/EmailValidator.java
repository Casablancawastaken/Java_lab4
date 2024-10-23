package java_labs.Lab4.t3;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EmailValidator {
    private static final Logger logger = Logger.getLogger(EmailValidator.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("email_error_log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("Ошибка при настройке логгера: " + e.getMessage());
        }
    }

    public static void validateEmail(String email) throws CustomEmailFormatException {
        if (email == null || !email.contains("@") || !email.matches(".+@.+\\..+")) {
            throw new CustomEmailFormatException("Недопустимый формат email: " + email);
        }
        System.out.println("Email корректен: " + email);
    }

    public static void logError(String message) {
        logger.severe(message);
    }
}
