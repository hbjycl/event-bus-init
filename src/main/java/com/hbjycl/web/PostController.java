package com.hbjycl.web;

import com.bird.eventbus.EventBus;
import com.hbjycl.model.DeviceInfo;
import com.hbjycl.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenlu
 */
@RestController
@Slf4j
public class PostController {

    @Autowired
    private EventBus eventBus;
    @Autowired
    private DeviceService deviceService;


    @RequestMapping(value = "/device", method = RequestMethod.POST)
    public void device(@RequestBody DeviceInfo deviceInfo) {
        eventBus.push(deviceInfo);
    }

    @RequestMapping(value = "/device", method = RequestMethod.GET)
    public DeviceInfo device(String id) {
       return deviceService.get(id);
    }
}
