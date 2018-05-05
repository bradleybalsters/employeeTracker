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

    public void showTasks()
    {
        if (LandingScreenActivity.employeeCole.getIsTracked()) {
                if (!(LandingScreenActivity.employeeCole.t1IsDeleted())) {
                    first.setText(LandingScreenActivity.employeeCole.getTask1());
                } else {
                    rel.removeView(first);
                }
                if (!(LandingScreenActivity.employeeCole.t2IsDeleted())) {
                    second.setText(LandingScreenActivity.employeeCole.getTask2());
                } else {
                    rel.removeView(second);
                }
            }
            else if (LandingScreenActivity.employeeBob.getIsTracked())
            {
                if (!(LandingScreenActivity.employeeBob.t1IsDeleted())) {
                    first.setText(LandingScreenActivity.employeeBob.getTask1());
                } else {
                    rel.removeView(first);
                }
                if (!(LandingScreenActivity.employeeBob.t2IsDeleted())) {
                    second.setText(LandingScreenActivity.employeeBob.getTask2());
                } else {
                    rel.removeView(second);
                }
            }
            else
            {
                if (!(LandingScreenActivity.employeeKyra.t1IsDeleted())) {
                    first.setText(LandingScreenActivity.employeeKyra.getTask1());
                } else {
                    rel.removeView(first);
                }
                if (!(LandingScreenActivity.employeeKyra.t2IsDeleted())) {
                    second.setText(LandingScreenActivity.employeeKyra.getTask2());
                } else {
                    rel.removeView(second);
                }
            }
    }

    public void deleteTask1()
    {
        switch (whichEmployee)
        {
            case 0:
                LandingScreenActivity.employeeCole.deleteTask(0);
                break;
            case 1:
                LandingScreenActivity.employeeBob.deleteTask(0);
                break;
            case 2:
                LandingScreenActivity.employeeKyra.deleteTask(0);
                break;
        }
    }

    public void deleteTask2()
    {
        switch (whichEmployee)
        {
            case 0:
                LandingScreenActivity.employeeCole.deleteTask(1);
                break;
            case 1:
                LandingScreenActivity.employeeBob.deleteTask(1);
                break;
            case 2:
                LandingScreenActivity.employeeKyra.deleteTask(1);
                break;
        }
    }
}
