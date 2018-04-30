package com.cornez.employeetracker;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TextView timeDisplay;
    private Button startBtn;
    private Button stopBtn;
    private Button resetBtn;

    private Timer watchTime;
    private long timeInMilliseconds;

    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_screen);

        setContentView(R.layout.activity_main);

        timeDisplay = (TextView) findViewById(R.id.textView1);
        startBtn = (Button) findViewById(R.id.start_button);
        stopBtn = (Button) findViewById(R.id.stop_button);
        resetBtn = (Button) findViewById(R.id.reset_button);

        stopBtn.setEnabled(false);
        resetBtn.setEnabled(false);

        watchTime = new Timer();

        mHandler = new Handler();
    }

    public void startTimer(View view){
        stopBtn.setEnabled(true);
        startBtn.setEnabled(false);
        resetBtn.setEnabled(false);

        watchTime.setStartTime(SystemClock.uptimeMillis());
        mHandler.postDelayed(updateTimerRunnable, 20);
    }

    private Runnable updateTimerRunnable = new Runnable() {
        @Override
        public void run() {

            timeInMilliseconds = SystemClock.uptimeMillis() - watchTime.getStartTime();

            watchTime.setTimeUpdate(watchTime.getmStoredTime() + timeInMilliseconds);

            int time = (int) (watchTime.getTimeUpdate()/1000);

            int minutes = time / 60;
            int seconds = time % 60;
            int milliseconds = (int) (watchTime.getTimeUpdate() % 1000);

            timeDisplay.setText(String.format("%02d",minutes)+":"+String.format("%02d",seconds)+
                    ":"+String.format("%02d", milliseconds));

            mHandler.postDelayed(this, 0);

        }
    };

    public void stopTimer(View view){
        stopBtn.setEnabled(false);
        startBtn.setEnabled(true);
        resetBtn.setEnabled(true);

        watchTime.setStartTime(SystemClock.uptimeMillis());

        mHandler.removeCallbacks(updateTimerRunnable);
    }

    public void resetTimer(View view){
        watchTime.resetWatchTime();
        timeInMilliseconds =0L;

        int minutes = 0;
        int seconds = 0;
        int milliseconds = 0;

        timeDisplay.setText(String.format("%02d",minutes)+":"+String.format("%02d",seconds)+
                ":"+String.format("%02d", milliseconds));



    }
