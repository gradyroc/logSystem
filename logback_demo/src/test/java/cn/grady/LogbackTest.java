package cn.grady;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gradyzhou
 * @version 1.0, on 2:44 2020/3/25.
 */
public class LogbackTest {

    private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void logbackTest(){

        logger.info("logback quick study");
    }
}
