package top.lemenk.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lemenk.data_jpa.entity.User;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.data_jpa.repository
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/3/1 15:22
 * @Description: 用户Dao
 */

//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer>{}
