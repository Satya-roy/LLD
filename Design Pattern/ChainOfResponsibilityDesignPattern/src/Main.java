import LoggingSystem.DebugLoggingProcessor;
import LoggingSystem.ErrorLoggingProcessor;
import LoggingSystem.InfoLoggingProcessor;
import LoggingSystem.LogProcessor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLoggingProcessor(new DebugLoggingProcessor(new ErrorLoggingProcessor(null)));

        logger.log(3, "Exception happens");
    }
}