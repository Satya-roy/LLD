package LoggingSystem;

public class DebugLoggingProcessor extends LogProcessor {
    public DebugLoggingProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == DEBUG) {
            System.out.println("DEBUG : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
