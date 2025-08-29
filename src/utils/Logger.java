package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_DIR = "logs/";
    private static final String ERROR_LOG_FILE = LOG_DIR + "errors.log";
    private static final String INFO_LOG_FILE = LOG_DIR + "info.log";
    private static final String DEBUG_LOG_FILE = LOG_DIR + "debug.log";
    
    private static Logger instance;
    private PrintWriter errorWriter;
    private PrintWriter infoWriter;
    private PrintWriter debugWriter;
    
    private Logger() {
        initializeLogFiles();
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    private void initializeLogFiles() {
        try {
            // Create logs directory if it doesn't exist
            java.io.File logDir = new java.io.File(LOG_DIR);
            if (!logDir.exists()) {
                boolean created = logDir.mkdirs();
                if (!created) {
                    System.err.println("Failed to create logs directory");
                }
            }
            
            // Initialize writers with auto-flush enabled
            errorWriter = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true), true);
            infoWriter = new PrintWriter(new FileWriter(INFO_LOG_FILE, true), true);
            debugWriter = new PrintWriter(new FileWriter(DEBUG_LOG_FILE, true), true);
            
            // Write initial log entry to confirm files are working
            String initMessage = String.format("[INFO] [%s] Logger initialized successfully", getTimestamp());
            infoWriter.println(initMessage);
            infoWriter.flush();
            
        } catch (IOException e) {
            System.err.println("Failed to initialize log files: " + e.getMessage());
        }
    }
    
    private String getTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    
    public void error(String message) {
        String logEntry = String.format("[ERROR] [%s] %s", getTimestamp(), message);
        if (errorWriter != null) {
            errorWriter.println(logEntry);
            errorWriter.flush(); // Force write to disk
        }
        // Also print to console for debugging
        System.err.println(logEntry);
    }
    
    public void error(String message, Throwable throwable) {
        String logEntry = String.format("[ERROR] [%s] %s", getTimestamp(), message);
        if (errorWriter != null) {
            errorWriter.println(logEntry);
            throwable.printStackTrace(errorWriter);
            errorWriter.flush(); // Force write to disk
        }
        // Also print to console for debugging
        System.err.println(logEntry);
        throwable.printStackTrace();
    }
    
    public void info(String message) {
        String logEntry = String.format("[INFO] [%s] %s", getTimestamp(), message);
        if (infoWriter != null) {
            infoWriter.println(logEntry);
            infoWriter.flush(); // Force write to disk
        }
        // Also print to console for debugging
        System.out.println(logEntry);
    }
    
    public void debug(String message) {
        String logEntry = String.format("[DEBUG] [%s] %s", getTimestamp(), message);
        if (debugWriter != null) {
            debugWriter.println(logEntry);
            debugWriter.flush(); // Force write to disk
        }
        // Also print to console for debugging
        System.out.println(logEntry);
    }
    
    public void close() {
        try {
            if (errorWriter != null) {
                errorWriter.println(String.format("[INFO] [%s] Logger closing...", getTimestamp()));
                errorWriter.flush();
                errorWriter.close();
            }
            if (infoWriter != null) {
                infoWriter.println(String.format("[INFO] [%s] Logger closing...", getTimestamp()));
                infoWriter.flush();
                infoWriter.close();
            }
            if (debugWriter != null) {
                debugWriter.println(String.format("[INFO] [%s] Logger closing...", getTimestamp()));
                debugWriter.flush();
                debugWriter.close();
            }
        } catch (Exception e) {
            System.err.println("Error closing logger: " + e.getMessage());
        }
    }
}
