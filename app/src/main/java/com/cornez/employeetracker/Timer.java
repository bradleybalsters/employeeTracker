package com.cornez.employeetracker;

public class Timer {

    private long mStartTime;
    private long mTimeUpate;
    private long mStoredTime;

    public WatchTime(){
        mStartTime = 0L;
        mStoredTime = 0L;
        mTimeUpate = 0L;
    }

    public void resetWatchTime(){
        mStartTime = 0L;
        mStoredTime =0L;
        mTimeUpate = 0L;
    }

    public void setStartTime(long startTime){
        mStartTime = startTime;
    }

    public long getStartTime(){
        return mStartTime;
    }

    public void setTimeUpdate(long timeUpdate){
        mTimeUpate = timeUpdate;
    }

    public long getTimeUpdate(){
        return mTimeUpate;
    }

    public void addStoredTime(long timeInMilliseconds){
        mStoredTime += timeInMilliseconds;
    }

    public long getmStoredTime(){
        return mStoredTime;
    }

}

