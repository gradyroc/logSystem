import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gradyzhou
 * @version 1.0, on 21:24 2020/7/31.
 */
public class JulLoggerTest {


    @Test
    public void quickTest(){
        Logger logger = Logger.getLogger("JulLoggerTest");

        logger.info("hello jul");

        logger.log(Level.WARNING,"hello jul info");
    }
}
