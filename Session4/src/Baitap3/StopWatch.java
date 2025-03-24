package Baitap3;

import java.util.Date;

public class StopWatch {
    private Date startTime ;
    private Date endTime;

    //Constructor
    public StopWatch() {
        startTime = new Date();
    }
    //get, set
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    //method
    public Date start() {
        startTime = new Date();
        return startTime;
    }
    public Date stop() {
        endTime = new Date();
        return endTime;
    }
    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
