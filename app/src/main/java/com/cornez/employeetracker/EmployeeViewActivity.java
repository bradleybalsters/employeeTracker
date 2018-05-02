package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmployeeViewActivity extends AppCompatActivity
{
    Button btnIn;
    Button btnOut;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setContentView(R.layout.employee_view);
        btnIn = (Button) findViewById(R.id.empViewInButton);
        btnOut= (Button) findViewById(R.id.empViewOutButton);
    }

    //Transition between layouts
    public void changeLayout(View view)
    {
        View.OnClickListener handler = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (v == btnIn)
                {
                    Intent intentMain = new Intent(EmployeeViewActivity.this,
                            EmployeeTaskActivity.class);
                    EmployeeViewActivity.this.startActivity(intentMain);
                }
                if (v == btnOut)
                {
                    Intent intentMain = new Intent(EmployeeViewActivity.this,
                            LandingScreenActivity.class);
                    EmployeeViewActivity.this.startActivity(intentMain);
                }
            }
        };

        btnIn.setOnClickListener(handler);
        btnOut.setOnClickListener(handler);
    }
}
