package com.hbjycl.service;

import com.bird.eventbus.handler.EventHandler;
import com.bird.eventbus.registry.IEventRegistry;
import com.hbjycl.dao.PostRepository;
import com.hbjycl.eventbus.DeviceInfo;
import com.hbjycl.eventbus.PostInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author chenlu
 */
@Service
@Slf4j
public class PostService   {
    @Resource
    private PostRepository postRepository;
    @Resource
    private IEventRegistry eventRegistry;

    public PostInfo save(PostInfo postInfo){
       return postRepository.save(postInfo);
    }

    public PostInfo getById(String id){
        return Optional.of(postRepository.findById(id))
                .flatMap(postInfo -> postInfo)
                .orElse(new PostInfo());
    }

    @EventHandler
    public void HandleEvent(PostInfo eventArg) {
        System.out.println("PostInfo======,{}"+eventArg.getFirstName());
        save(eventArg);
    }

    @EventHandler
    public void handleDevice(DeviceInfo deviceInfo) {
        System.out.println("device2222222222222222222222222222222222222222222222222222222222222======,{}"+deviceInfo.getDeviceName());
    }



}
