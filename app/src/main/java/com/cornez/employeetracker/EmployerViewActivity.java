package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmployerViewActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employer_view);
    }

    //Transition between layouts
    final Button btnView = (Button) findViewById(R.id.employerViewButton);
    final Button btnExit= (Button) findViewById(R.id.employerViewTaskButton);
    final Button btnTask = (Button) findViewById(R.id.employerViewExitButton);

    public void changeLayout(View view)
    {
        View.OnClickListener handler = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (v == btnView)
                {
                    Intent intentMain = new Intent(EmployerViewActivity.this,
                            MainActivity.class);
                    EmployerViewActivity.this.startActivity(intentMain);
                }
                if (v == btnExit)
                {
                    Intent intentMain = new Intent(EmployerViewActivity.this,
                            LandingScreenActivity.class);
                    EmployerViewActivity.this.startActivity(intentMain);
                }
                if (v == btnTask)
                {
                    Intent intentMain = new Intent(EmployerViewActivity.this,
                            EmployerTaskActivity.class);
                    EmployerViewActivity.this.startActivity(intentMain);
                }
            }
        };

        btnView.setOnClickListener(handler);
        btnExit.setOnClickListener(handler);
        btnTask.setOnClickListener(handler);
    }
}
