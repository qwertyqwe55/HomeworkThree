package com.netcracker.chapter9.time;

public class WorldClock extends Clock{

    private int UTC;

    public WorldClock(int UTC) {
        this.UTC = UTC;
    }

    @Override
    public int getHours() {
        return super.getHours() - 3 + UTC;
    }

    @Override
    public void setAlarm(String alarm) {
        char[] alarms = alarm.toCharArray();
        int hour;
        alarm = "";
        int i = 0;
        if(alarms.length == 5){
             hour = alarms[1]-'0' - 3 + UTC;
             alarm += alarms[0] +""+ hour;
             i = 2;
        }else {
            hour = alarms[0]-'0'-3+UTC;
            alarm+=hour;
            i=2;
        }

        if(Integer.valueOf(alarm) > 24) {
            String t = String.valueOf(Integer.valueOf(alarm) - 24);
            alarm = "";
            alarm += t;
        }

        for (;i < alarms.length; i++) {
            alarm += alarms[i];
        }
        super.setAlarm(alarm);
    }
}
