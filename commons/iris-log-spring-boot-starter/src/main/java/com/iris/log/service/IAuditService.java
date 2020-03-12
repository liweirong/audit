package com.iris.log.service;

import com.iris.log.model.Audit;

/**
 * 审计日志接口
 *
 * @Author: iris
 * @date 2020/2/3
 * <p>
 * Blog: https://blog.csdn.net/zlt2000
 * Github: https://github.com.iris2000
 */
public interface IAuditService {
    void save(Audit audit);
}
