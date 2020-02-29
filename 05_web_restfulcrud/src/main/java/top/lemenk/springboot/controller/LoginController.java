package top.lemenk.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/27 20:49
 * @Description: 登陆控制器
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password")String password,
                        Map<String, Object> map,
                        HttpSession httpSession){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登陆成功
            //为防止重复提交表单，进行重定向
            httpSession.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            //登陆失败
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }
}
