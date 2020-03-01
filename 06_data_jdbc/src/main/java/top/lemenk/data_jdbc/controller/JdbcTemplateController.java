package top.lemenk.data_jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.data_jdbc.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/3/1 11:58
 * @Description: JdbcTemplate演示
 */

@Controller
public class JdbcTemplateController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from department");
        return list.get(0);
    }
}
