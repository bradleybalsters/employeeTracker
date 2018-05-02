package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class EmployerViewActivity extends AppCompatActivity
{
    public static String taggedEmployee;

    Button btnView;
    Button btnExit;
    Button btnTask;
    RadioButton firstEmp, secondEmp, thirdEmp;

    boolean emp1, emp2, emp3;
    String trackedEmployee;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setContentView(R.layout.employer_view);

        btnView = (Button) findViewById(R.id.employerViewButton);
        btnExit= (Button) findViewById(R.id.employerViewExitButton);
        btnTask = (Button) findViewById(R.id.employerViewTaskButton);

        firstEmp = (RadioButton) findViewById(R.id.employee1);
        secondEmp = (RadioButton) findViewById(R.id.employee2);
        thirdEmp = (RadioButton) findViewById(R.id.employee3);

        emp1 = false;
        emp2 = false;
        emp3 = false;
    }

    //Transition between layouts
    public void changeLayout(View view)
    {
        View.OnClickListener handler = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (v == btnView)
                {
                    taggedEmployee = selectedEmployee();
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
                    taggedEmployee = selectedEmployee();
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

    public String selectedEmployee() {
        if (firstEmp.isChecked()) {
            emp1 = true;
            trackedEmployee = "Cole Jacobs";
        } else if (secondEmp.isChecked()) {
            emp2 = true;
            trackedEmployee = "Bob Lindsay";
        } else
        {
            emp3 = true;
            trackedEmployee = "Kyra Mill";
        }

        return trackedEmployee;
    }
}
