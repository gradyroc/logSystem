package cn.grady;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gradyzhou
 * @version 1.0, on 17:08 2020/3/20.
 *
 * http://www.slf4j.org/manual.html
 */
public class Slf4jTest {

    //使用slf4j 日志门面以及log4j2的适配器 适配和使用log4j2 的日志实现
    private static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);


    @Test
    public void slf4jTest(){
        logger.info("wonima");

        //占位符的输出内容
        logger.debug("xxxxxxxxxx");
        logger.info("user:{},{}","grady",81);
    }
}
