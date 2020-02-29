package top.lemenk.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.lemenk.springboot.dao.DepartmentDao;
import top.lemenk.springboot.dao.EmployeeDao;
import top.lemenk.springboot.entities.Department;
import top.lemenk.springboot.entities.Employee;

import java.util.Collection;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/28 13:41
 * @Description: 处理员工相关请求
 */

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    /**
     * 查询所有员工，并返回到员工页面
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String list(Model model){
        //获取所有员工
        Collection<Employee> employees = employeeDao.getAll();
        //将数据放在请求域中
        model.addAttribute("emps",employees);
        //thymeleaf会默认从classpath:/templates/下寻找文件
        return "emp/list";
    }

    //员工信息添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //查询所有部门，并在添加页面显示
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //添加员工功能
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("保存的员工信息："+employee);
        //保存员工信息
        employeeDao.save(employee);
        //forward：转发
        return "redirect:/emps";//重定向
    }

    //员工信息编辑页面，并且在页面显示当前员工信息
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);

        //显示所有的部门列表
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    //员工信息修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){

        System.out.println("修改的员工数据："+employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
