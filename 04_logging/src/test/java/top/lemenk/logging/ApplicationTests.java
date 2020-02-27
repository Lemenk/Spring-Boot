package top.lemenk.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {

        //日志级别，由低到高：trace<debug<info<warn<error
        //可以调整日志输出级别，就只会输出这个设定级别及以上的内容
        //默认级别为info。在配置文件中修改
        logger.trace("这是trace日志……");
        logger.debug("这是debug日志……");
        logger.info("这是info日志……");
        logger.warn("这是warn日志……");
        logger.error("这是error日志……");

    }

}
