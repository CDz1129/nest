package com.jovezhao.nest.ddd.event.provider.distribut;

import com.jovezhao.nest.ddd.event.EventHandler;
import com.jovezhao.nest.ddd.event.provider.distribut.DistributedEventConsumer;
import com.jovezhao.nest.ddd.event.provider.distribut.EventData;

/**
 * 幂等处理事件消息
 * Created by zhaofujun on 2017/6/22.
 */
public class EventDataProcessor {
    private EventData eventData;
    private EventHandler eventHandler;

    public EventDataProcessor(EventData eventData, EventHandler eventHandler) {
        this.eventData = eventData;
        this.eventHandler = eventHandler;
    }

    public void process() {
        eventHandler.handle(eventData.getData());
    }


}