package com.netcracker.chapter9.time;

import java.time.LocalTime;

public class Clock {
    protected String alarm;
    public int getHours(){
        return LocalTime.now().getHour();
    }

    public int getMinutes(){
        return LocalTime.now().getMinute();
    }

    public String getTime(){
        return getHours() + ":" + getMinutes();
    }

    public boolean Alarm(){
        if(getTime().equals(alarm)){
            return true;
        }
        return false;
    }

    public void setAlarm(String alarm){
        this.alarm = alarm;
    }

}
