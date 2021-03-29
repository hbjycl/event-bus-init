package com.hbjycl.dao;
/**
 * Created by 19130 on 2018/5/16.
 */
import com.hbjycl.model.DeviceInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author linzhiqiang
 */
@Component
public interface DeviceRepository extends ElasticsearchRepository<DeviceInfo,String> {
 
    /**
     * 查询新闻信息
     * @param id
     * @return
     */
    DeviceInfo queryDeviceInfoById(String id);
}
