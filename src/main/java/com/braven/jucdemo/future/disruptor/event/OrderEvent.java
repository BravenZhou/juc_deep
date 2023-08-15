package com.braven.jucdemo.future.disruptor.event;


import lombok.Data;

/**
 * @author braven
 * 消息载体(事件)
 */
@Data
public class OrderEvent {

    private long value;
    private String name;

}
