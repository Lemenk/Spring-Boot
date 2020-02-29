package top.lemenk.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lemenk.springboot.exception.UserNotExistException;

import java.util.Arrays;
import java.util.Map;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/27 15:02
 * @Description: web层
 */

@Controller
public class HelloController {

    /*//配置访问登陆页
    @RequestMapping({"/","/login.html"})
    public String login(){
        return "login.html";
    }*/

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        //默认将会在classpath:/templates/路径下寻找success.html文件
        return "success";
    }
}
