package com.hbjycl.eventbus;

import com.bird.eventbus.arg.EventArg;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @author chenlu
 */
@Document(indexName = "post", shards = 1,replicas = 0, refreshInterval = "-1")
@Data
@EqualsAndHashCode(callSuper = true)
public class PostInfo  extends EventArg {
    @Id
    private String id;
    @Field
    private String firstName;

}
