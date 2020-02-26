package top.lemenk.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.lemenk.springboot.service.HelloService;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.config
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/26 16:12
 * @Description: 配置类
 */

@Configuration//指明当前类是配置类
public class MyApplicationConfig {

    //将方法的返回值添加到容器中，容器中这些组件的默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}
