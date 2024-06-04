package LoggingSystem;

public class ErrorLoggingProcessor extends LogProcessor{
    public ErrorLoggingProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == ERROR) {
            System.out.println("ERROR : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
