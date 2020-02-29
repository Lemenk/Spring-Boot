package top.lemenk.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.lemenk.springboot.componet.LoginHandleInterceptor;
import top.lemenk.springboot.componet.MyLocaleResolver;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.config
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/27 17:03
 * @Description: SpringMVC配置类
 */

//使用WebMvcConfigurer可以拓展SpringMVC的功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //发送/haha，请求来到success页面
        registry.addViewController("/haha").setViewName("success");
    }

    //配置访问登录页
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandleInterceptor()).addPathPatterns("/**").excludePathPatterns("/login.html","/","/user/login","/asserts/**","/webjars/**");
            }
        };
        return webMvcConfigurer;
    }

    //配置国际化组件，区域信息解析器
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
