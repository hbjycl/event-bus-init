package com.hbjycl.service;

import com.bird.eventbus.handler.EventHandler;
import com.hbjycl.model.TestEventArg;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    
    @EventHandler
    public void HandleEvent(TestEventArg eventArg) {
        System.out.println("notify======");
    }
}