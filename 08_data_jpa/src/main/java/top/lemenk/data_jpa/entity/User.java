package top.lemenk.data_jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.data_jpa.entity
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/3/1 15:10
 * @Description: 用户实体类
 */
//使用JPA注解配置映射关系
@Entity//告诉JPA这是一个实体类，与数据表映射
@Table(name = "tbl_user")//注定与之对应的数据表名，默认表名为类名小写
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class User {

    @Id//标识主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "last_name",length = 50)//与数据表一个列对应
    private String lastName;

    @Column//若省略则默认数据表类名为属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
