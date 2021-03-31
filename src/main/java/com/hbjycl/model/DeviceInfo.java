package com.hbjycl.model;

import com.bird.eventbus.arg.EventArg;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @author chenlu
 */
@Document(indexName = "device", shards = 1,replicas = 0, refreshInterval = "-1")
@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceInfo extends EventArg {
    @Id
    private String id;
    @Field
    private String deviceName;
    @Field
    private String ip;
    @Field
    private String orgId;
    @Field
    private String deviceId;
    @Field
    private String productId;
}
