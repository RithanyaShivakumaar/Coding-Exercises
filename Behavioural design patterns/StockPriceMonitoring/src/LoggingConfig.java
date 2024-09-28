import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingConfig {
    private static final Logger logger = Logger.getLogger(LoggingConfig.class.getName());

    public static void setup() throws IOException {
        FileHandler fileHandler = new FileHandler("stock_monitoring.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        Logger.getLogger("").addHandler(fileHandler);
    }
}
