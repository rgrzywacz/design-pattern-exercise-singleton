package account;

import java.time.LocalDateTime;

public class ApplicationLogger {

    private static ApplicationLogger instance = null;

    private ApplicationLogger () {}

    public synchronized static ApplicationLogger getInstance() {
        if (instance == null) {
            instance = new ApplicationLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}
