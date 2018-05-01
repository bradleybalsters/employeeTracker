package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmployeeViewActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);
    }

    //Transition between layouts
    final Button btnIn = (Button) findViewById(R.id.empViewInButton);
    final Button btnOut= (Button) findViewById(R.id.empViewOutButton);

    public void changeLayout(View view)
    {
        View.OnClickListener handler = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (v == btnIn)
                {
                    Intent intentMain = new Intent(EmployeeViewActivity.this,
                            EmployeeViewActivity.class);
                    EmployeeViewActivity.this.startActivity(intentMain);
                }
                if (v == btnOut)
                {
                    Intent intentMain = new Intent(EmployeeViewActivity.this,
                            EmployeeViewActivity.class);
                    EmployeeViewActivity.this.startActivity(intentMain);
                }
            }
        };

        btnIn.setOnClickListener(handler);
        btnOut.setOnClickListener(handler);
    }
}
