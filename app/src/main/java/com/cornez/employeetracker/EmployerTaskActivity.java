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
    RelativeLayout rel;

    Button btnClear;
    Button btnEdit;
    Button btnBack;

    CheckBox first;
    CheckBox second;
    CheckBox third;

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
        third = (CheckBox) findViewById(R.id.checkBox3);
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

    //TODO: Fix this
    public void clearChecked()
    {
        if (first.isChecked())
        {
            first.setVisibility(View.GONE);
        }
        if (second.isChecked())
        {
            second.setVisibility(View.GONE);
        }
        if (third.isChecked())
        {
            third.setVisibility(View.GONE);
        }
    }
}
