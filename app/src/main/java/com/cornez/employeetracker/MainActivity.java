package com.cornez.employeetracker;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        timeDisplay = (TextView) findViewById(R.id.mapTimer);
        startBtn = (Button) findViewById(R.id.start_button);
        stopBtn = (Button) findViewById(R.id.stop_button);
        resetBtn = (Button) findViewById(R.id.reset_button);

        stopBtn.setEnabled(false);
        resetBtn.setEnabled(false);

        watchTime = new Timer();

        mHandler = new Handler();


    }



}
