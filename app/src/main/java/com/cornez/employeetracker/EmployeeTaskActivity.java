package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmployeeTaskActivity extends AppCompatActivity
{
    Button btnView;
    Button btnClear;
    Button btnEdit;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_task_view);

        btnView = (Button) findViewById(R.id.taskView2BackButton);
        btnClear= (Button) findViewById(R.id.taskView2ClearButton);
        btnEdit = (Button) findViewById(R.id.taskView2EditButton);
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
                if (v == btnEdit)
                {

                }
                if (v == btnClear)
                {

                }
            }
        };

        btnView.setOnClickListener(handler);
        btnEdit.setOnClickListener(handler);
        btnClear.setOnClickListener(handler);
    }
}
