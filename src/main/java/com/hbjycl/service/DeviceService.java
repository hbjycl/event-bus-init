package com.hbjycl.service;

import com.bird.eventbus.handler.EventHandler;
import com.hbjycl.dao.DeviceRepository;
import com.hbjycl.model.DeviceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class DeviceService {
    @Resource
    private DeviceRepository deviceRepository;
    
    @EventHandler
    public void HandleEvent(DeviceInfo eventArg) {
        log.info(eventArg.toString());
        deviceRepository.save(eventArg);
    }

    public DeviceInfo get(String id){
        return deviceRepository.queryDeviceInfoById(id);
    }
}