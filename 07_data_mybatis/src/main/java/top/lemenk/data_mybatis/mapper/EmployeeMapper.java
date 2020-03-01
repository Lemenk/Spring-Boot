package top.lemenk.data_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lemenk.data_mybatis.bean.Employee;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.data_mybatis.mapper
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/3/1 14:19
 * @Description: 员工Mapper
 */
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
