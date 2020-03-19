package com.iris.blog.service;

import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.iris.blog.config.RabbitConfig;
import com.iris.blog.entity.SysLog;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author iris
 * @date 2020/3/19
 */
@Service
public class LoggerService {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void log(SysLog sysLog){
        rabbitTemplate.convertAndSend(RabbitConfig.queueName, JSON.toJSONString(sysLog));
    }
}
