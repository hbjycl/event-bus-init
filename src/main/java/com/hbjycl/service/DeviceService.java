package com.hbjycl.service;

import com.bird.eventbus.handler.EventHandler;
import com.hbjycl.eventbus.DeviceInfo;
import org.springframework.stereotype.Service;

/**
 * @author chenlu
 */
@Service
public class DeviceService {

    @EventHandler
    public void handleDevice(DeviceInfo deviceInfo) {
        System.out.println("device======,{}"+deviceInfo.getDeviceName());
    }
}
