import utils.Logger;

public class test_logger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        
        System.out.println("Testing Logger...");
        
        // Test different log levels
        logger.info("This is an info message");
        logger.error("This is an error message");
        logger.debug("This is a debug message");
        
        // Test with exception
        try {
            throw new RuntimeException("Test exception");
        } catch (Exception e) {
            logger.error("Caught exception", e);
        }
        
        System.out.println("Logger test completed. Check logs/ directory.");
        
        // Close logger
        logger.close();
    }
}
