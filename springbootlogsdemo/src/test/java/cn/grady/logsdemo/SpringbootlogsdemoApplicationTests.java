package cn.grady.logsdemo;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootlogsdemoApplicationTests {

    public static final Logger logger = LoggerFactory.getLogger(SpringbootlogsdemoApplicationTests.class);

//    public static void main(String[] args) {
//        SpringApplication.run(SpringbootlogsdemoApplicationTests.class, args);
//        logger.debug("spring boot logs demo debug");
//
//    }

    @Test
    public void contextLoads() {
    	logger.debug("spring boot logs demo debug");
    	logger.info("spring boot logs demo info");
    	logger.error("spring boot logs demo error");
    	logger.trace("spring boot logs demo trace");

//    	使用log4j2 使用桥接器切换为slf4j 门面和logback 日志实现
        org.apache.logging.log4j.Logger logger1 = LogManager.getLogger(SpringbootlogsdemoApplicationTests.class);

        logger1.debug("log4j face debug");
        logger1.info("log4j face info");
        logger1.error("log4j face error");
        logger1.trace("log4j face trace");


    }

}
