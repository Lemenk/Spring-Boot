package top.lemenk.springboot.exception;

/**
 * @BelongsProject: Spring-Boot
 * @BelongsPackage: top.lemenk.springboot.exception
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/28 21:59
 * @Description: 用户不存在异常
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
