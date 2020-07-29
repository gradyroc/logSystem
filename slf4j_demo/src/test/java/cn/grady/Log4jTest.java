package cn.grady;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author gradyzhou
 * @version 1.0, on 0:41 2020/3/25.
 */
public class Log4jTest {

//    定义log4j日志记录器
    public static final Logger LOGGER = Logger.getLogger(Log4jTest.class);


//    测试桥接器
    @Test
    public void log4jBridgeTest(){
        LOGGER.info("log4jBridgeTest 测试桥接器");

    }
}
