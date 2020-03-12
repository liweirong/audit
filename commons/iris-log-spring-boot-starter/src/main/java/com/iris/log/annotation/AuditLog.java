package com.iris.log.annotation;

import java.lang.annotation.*;

/**
 * @Author: iris
 * @date 2020/2/3
 * <p>
 * Blog: https://blog.csdn.net/zlt2000
 * Github: https://github.com.iris2000
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuditLog {
    /**
     * 操作信息
     */
    String operation();
}
