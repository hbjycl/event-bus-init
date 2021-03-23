package com.hbjycl.service;

import com.bird.eventbus.handler.EventMethodDefinition;
import com.bird.eventbus.handler.IEventMethodInitializeListener;
import com.bird.eventbus.log.EventHandleLog;
import com.bird.eventbus.log.EventSendLog;
import com.bird.eventbus.log.IEventHandleLogStore;
import com.bird.eventbus.log.IEventSendLogStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chenlu
 */
@Component
@Slf4j
public class LogService implements IEventMethodInitializeListener, IEventSendLogStore, IEventHandleLogStore {


    @Override
    public void initialize(List<EventMethodDefinition> definitions) {
        definitions.forEach(definition -> log.info(definition.toString()));
    }

    @Override
    public void storeHandleLogs(List<EventHandleLog> logs) {
        logs.forEach(eventHandleLog -> log.info(eventHandleLog.toString()));

    }

    @Override
    public void storeSendLogs(List<EventSendLog> logs) {
        logs.forEach(eventHandleLog -> log.info(eventHandleLog.toString()));
    }
}
