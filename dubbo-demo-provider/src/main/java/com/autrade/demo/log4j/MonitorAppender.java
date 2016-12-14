package com.autrade.demo.log4j;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class MonitorAppender extends AppenderSkeleton {

    private String monitorKey;

    public String getMonitorKey() {

        return monitorKey;
    }

    public void setMonitorKey(String monitorKey) {

        this.monitorKey = monitorKey;
    }

    @Override
    public void close() {
        
    }

    @Override
    public boolean requiresLayout() {

        return false;
    }

    @Override
    protected void append(LoggingEvent event) {

        if(event.getMessage().toString().contains(monitorKey)) {
            super.doAppend(event);
        }
    }

}
