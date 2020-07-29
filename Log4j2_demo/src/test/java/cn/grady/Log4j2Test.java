package cn.grady;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author gradyzhou
 * @version 1.0, on 1:36 2020/3/26.
 */
public class Log4j2Test {
    //定义日志记录器对象
    public static final Logger logger = LogManager.getLogger(Log4j2Test.class);


    @Test
    public void log4j2Test(){

        logger.info("info xxxxx");
        logger.warn("grady");
        logger.trace("xasdfa");
    }
}
