package com.cornez.employeetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingScreenActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_screen);
    }

    // Transitions between layouts
    public void changeLayout(View view)
    {
        final Button btnEmployer = (Button) findViewById(R.id.landingEmployerButton);
        final Button btnEmployee = (Button) findViewById(R.id.landingEmployeeButton);

        View.OnClickListener handler = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (v == btnEmployer)
                {
                    Intent intentMain = new Intent(LandingScreenActivity.this,
                            EmployerViewActivity.class);
                    LandingScreenActivity.this.startActivity(intentMain);
                }
                if (v == btnEmployee)
                {
                    Intent intentMain = new Intent(LandingScreenActivity.this,
                            EmployeeViewActivity.class);
                    LandingScreenActivity.this.startActivity(intentMain);
                }
            }
        };

        btnEmployee.setOnClickListener(handler);
        btnEmployer.setOnClickListener(handler);
    }
}