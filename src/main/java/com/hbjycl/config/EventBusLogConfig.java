package com.hbjycl.config;

import com.bird.eventbus.handler.EventMethodDefinition;
import com.bird.eventbus.handler.IEventMethodInitializeListener;
import com.bird.eventbus.log.EventHandleLog;
import com.bird.eventbus.log.EventSendLog;
import com.bird.eventbus.log.IEventHandleLogStore;
import com.bird.eventbus.log.IEventSendLogStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author chenlu
 */
@Slf4j
@Configuration
public class EventBusLogConfig implements IEventSendLogStore, IEventMethodInitializeListener, IEventHandleLogStore {

    @Override
    public void storeSendLogs(List<EventSendLog> logs) {
        log.info("事件总线发送日志：");
        logs.forEach(e -> log.info(e.toString()));
    }

    @Override
    public void initialize(List<EventMethodDefinition> definitions) {
        log.info("事件总线定义类：");
        definitions.forEach(definition -> log.info(definition.toString()));
    }


    @Override
    public void storeHandleLogs(List<EventHandleLog> logs) {
        log.info("事件总线处理日志：");
        logs.forEach(e -> log.info(e.toString()));
    }
}