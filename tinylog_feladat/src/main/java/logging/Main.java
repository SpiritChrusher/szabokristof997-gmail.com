package logging;

import org.tinylog.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Main {

   // private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Logger.error("This is an ERROR message");
        Logger.warn("This is a WARNING message");
        Logger.info("This is an INFO message");
        Logger.debug("This is a DEBUG message");
        Logger.trace("This is a TRACE message");
        Logger.info("User's name is {}", System.getProperty("user.name"));
        Logger.error("Something is wrong", new RuntimeException("Oops"));
    }

}