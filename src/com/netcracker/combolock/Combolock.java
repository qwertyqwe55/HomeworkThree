package com.netcracker.combolock;

import static java.lang.Math.abs;

public class Combolock {
    private int secret1;
    private int secret2;
    private int secret3;

    private final int max = 39;
    private final int min = 0;
    private int iterator = 1;

    private int now_secret1 = 0;
    private int now_secret2 = 0;
    private int now_secret3 = 0;


    public void reset() { secret1 = secret2 = secret3 = 0; }
    public void turnLeft(int ticks) {
        switch (iterator){
            case 1:
                now_secret1 = max - ticks;
                break;
            case 2:
                if(now_secret1 - ticks < 0){
                    now_secret2 = max + now_secret1 - ticks;
                }else{
                    now_secret2 = now_secret1 - ticks;
                }

                break;
            case 3:
                if(now_secret2 - ticks < 0){
                    now_secret3 = max + now_secret2 - ticks;
                }else{
                    now_secret3 = now_secret2 - ticks;
                }
                break;
        }
        iterator++;
    }
    public void turnRight(int ticks) {  switch (iterator){
        case 1:
            now_secret1 = min + ticks;
            break;
        case 2:
            if(now_secret1 + ticks > 39) {
                now_secret2 = now_secret1 + ticks- max;
            }else{
                now_secret2 = now_secret1 + ticks;
            }
            break;
        case 3:
            if(now_secret2 + ticks > 39) {
                now_secret3 = now_secret2 + ticks- max;
            }else{
                now_secret3 = now_secret2 + ticks;
            }
            break;

        }
        iterator++;
    }

    public boolean open() {
        return now_secret1 == secret1 && now_secret2 == secret2 && now_secret3 == secret3;
    }


    public Combolock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
}
