package top.lemenk.springboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/28 21:55
 * @Description: 自定义异常处理器
 */

@ControllerAdvice
public class MyExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String,Object> handleException(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","user not exist");
        map.put("message",e.getMessage());
        return map;
    }
}
