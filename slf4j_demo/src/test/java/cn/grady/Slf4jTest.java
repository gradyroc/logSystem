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

    private static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);


    @Test
    public void slf4jTest(){
        logger.info("wonima");

        //占位符的输出内容
        logger.info("user:{},{}","grady",81);
    }
}
