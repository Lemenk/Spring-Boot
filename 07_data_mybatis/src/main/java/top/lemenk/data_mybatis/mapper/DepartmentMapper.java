package top.lemenk.data_mybatis.mapper;

import org.apache.ibatis.annotations.*;
import top.lemenk.data_mybatis.bean.Department;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.data_mybatis.mapper
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/3/1 13:45
 * @Description: 部门Mapper
 */

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    //自动生成递增主键，并指明是id属性
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) value(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
