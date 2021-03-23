package com.hbjycl.dao;
/**
 * Created by 19130 on 2018/5/16.
 */
import com.hbjycl.eventbus.PostInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
/**
 * @author linzhiqiang
 */
@Component
public interface PostRepository extends ElasticsearchRepository<PostInfo,String> {
 
    /**
     * 查询新闻信息
     * @param id
     * @return
     */
    PostInfo queryPostInfoById(String id);
}
