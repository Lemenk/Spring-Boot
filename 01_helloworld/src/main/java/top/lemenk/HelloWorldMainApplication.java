package top.lemenk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/26 11:23
 * @Description: 主程序
 */

/**
 * @SpringBootApplication :该注解标注一个主程序类，说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        //将Spring boot程序启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
