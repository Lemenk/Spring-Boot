package top.lemenk.data_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.lemenk.data_mybatis.bean.Employee;
import top.lemenk.data_mybatis.mapper.EmployeeMapper;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.data_mybatis.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/3/1 14:42
 * @Description: 员工控制类
 */

@RestController
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeMapper.getEmpById(id);
    }

}
