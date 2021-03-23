package com.hbjycl.web;

import com.bird.eventbus.EventBus;
import com.bird.eventbus.registry.IEventRegistry;
import com.hbjycl.eventbus.DeviceInfo;
import com.hbjycl.eventbus.PostInfo;
import com.hbjycl.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author chenlu
 */
@RestController
@Slf4j
public class PostController {

    @Autowired
    private EventBus eventBus;
    @Autowired
    private PostService postService;
    @Resource
    private IEventRegistry eventRegistry;
    /**
     * 保存文章
     */
    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public PostInfo savePost(@RequestBody PostInfo post) {
        for (String topic : eventRegistry.getAllTopics()) {
            log.info(topic);
        }
        eventBus.push(post);
        return post;
    }

    @RequestMapping(value = "/devices", method = RequestMethod.POST)
    public DeviceInfo saveDevice(@RequestBody DeviceInfo deviceInfo) {
        eventBus.push(deviceInfo);
        return deviceInfo;
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public PostInfo getPost(@PathVariable String id) {
        return postService.getById(id);
    }

}
