package com.hbjycl.model;

import com.bird.eventbus.arg.EventArg;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TestEventArg extends EventArg {
    private String value;
}