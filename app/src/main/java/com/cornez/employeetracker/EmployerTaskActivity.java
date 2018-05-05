package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;

public class EmployerTaskActivity extends AppCompatActivity
{
    int whichEmployee;

    RelativeLayout rel;

    Button btnClear;
    Button btnEdit;
    Button btnBack;

    CheckBox first;
    CheckBox second;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employer_task_view);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        btnClear = (Button) findViewById(R.id.taskViewClearButton);
        btnEdit = (Button) findViewById(R.id.taskViewEditButton);
        btnBack = (Button) findViewById(R.id.taskViewBackButton);

        rel = (RelativeLayout) findViewById(R.id.employerTaskViewLayout);

        first = (CheckBox) findViewById(R.id.checkBox1);
        second = (CheckBox) findViewById(R.id.checkBox2);

        whichEmployee = getTrackedEmployee();
        showTasks();
    }

    //Transition between layouts
    public void changeLayout(View view)
    {
        View.OnClickListener handler = new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if (v == btnClear)
                {
                    clearChecked();
                }
//                if (v == btnEdit)
//                {
//
//                }
                if (v == btnBack)
                {
                    Intent intentMain = new Intent(EmployerTaskActivity.this,
                            EmployerViewActivity.class);
                    EmployerTaskActivity.this.startActivity(intentMain);
                }
            }
        };

//        btnEdit.setOnClickListener(handler);
        btnClear.setOnClickListener(handler);
        btnBack.setOnClickListener(handler);
    }

    public void clearChecked()
    {
        if (first.isChecked())
        {
            rel.removeView(first);
            deleteTask1();
        }
        if (second.isChecked())
        {
            rel.removeView(second);
            deleteTask2();
        }
    }

    public int getTrackedEmployee()
    {
        int id;

        if (LandingScreenActivity.employeeCole.getIsTracked())
        {
            id = LandingScreenActivity.employeeCole.getId();
        }
        else if (LandingScreenActivity.employeeBob.getIsTracked())
        {
            id = LandingScreenActivity.employeeBob.getId();
        }
        else
        {
            id = LandingScreenActivity.employeeKyra.getId();
        }

        return id;
    }

    public void showTasks()
    {
        switch (whichEmployee)
        {
            case 0:
                first.setText(LandingScreenActivity.employeeCole.getTask1());
                second.setText(LandingScreenActivity.employeeCole.getTask2());
                break;
            case 1:
                first.setText(LandingScreenActivity.employeeBob.getTask1());
                second.setText(LandingScreenActivity.employeeBob.getTask2());
                break;
            case 2:
                first.setText(LandingScreenActivity.employeeKyra.getTask1());
                second.setText(LandingScreenActivity.employeeKyra.getTask2());
        }
    }
}
