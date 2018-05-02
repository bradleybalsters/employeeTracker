package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class EmployeeTaskActivity extends AppCompatActivity
{
    Button btnView;
    Button btnClear;
    Button btnBack;

    RadioButton select1;
    RadioButton select2;

    RelativeLayout employeeTask;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_task_view);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        btnView = (Button) findViewById(R.id.taskViewButton);
        btnClear= (Button) findViewById(R.id.taskClearButton);
        btnBack = (Button) findViewById(R.id.taskViewBackButton);
        select1 = (RadioButton) findViewById(R.id.firstRB);
        select2 = (RadioButton) findViewById(R.id.secondRB);
        employeeTask = (RelativeLayout) findViewById(R.id.employeeTaskViewLayout);
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
                    Intent intentMain = new Intent(EmployeeTaskActivity.this,
                            MainActivity.class);
                    EmployeeTaskActivity.this.startActivity(intentMain);
                }
                if (v == btnBack)
                {
                    Intent intentMain = new Intent(EmployeeTaskActivity.this,
                            EmployeeViewActivity.class);
                    EmployeeTaskActivity.this.startActivity(intentMain);
                }
                if (v == btnClear)
                {
                    clearSelection();
                }
            }
        };

        btnView.setOnClickListener(handler);
        btnBack.setOnClickListener(handler);
        btnClear.setOnClickListener(handler);
    }

    public void clearSelection()
    {
        if (select1.isChecked() || select2.isChecked())
        {
            if(select1.isChecked())
            {
                select1.setVisibility(View.GONE);
            }
            else
            {
                select2.setVisibility(View.GONE);
            }
        }
    }
}
