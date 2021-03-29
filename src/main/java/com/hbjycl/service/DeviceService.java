package com.hbjycl.service;

import com.bird.eventbus.handler.EventHandler;
import com.hbjycl.dao.DeviceRepository;
import com.hbjycl.model.DeviceInfo;
import com.hbjycl.model.TestEventArg;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeviceService {
    @Resource
    private DeviceRepository deviceRepository;
    
    @EventHandler
    public void HandleEvent(DeviceInfo eventArg) {
        System.out.println(eventArg);
        deviceRepository.save(eventArg);
    }

    public DeviceInfo get(String id){
        return deviceRepository.queryDeviceInfoById(id);
    }
}