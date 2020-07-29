import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author gradyzhou
 * @version 1.0, on 15:34 2020/3/23.
 */
public class Log4jTest {

    @Test
    public void testQuick(){

        //暂时使用代码配置
//        BasicConfigurator.configure();

        Logger logger = Logger.getLogger(Log4jTest.class);
        logger.info("XXXXXXXXXXXXX");
    }
}
