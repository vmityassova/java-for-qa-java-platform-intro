import com.db.edu.logger.api.LoggerController;

public class LoggerTest {
    public static void main(String[] args) {
        LoggerController logger = new LoggerController();
        logger.log("test string");
    }
}
