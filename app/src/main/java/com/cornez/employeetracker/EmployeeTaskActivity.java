package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmployeeTaskActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_task_view);
    }

    //Transition between layouts
    final Button btnView = (Button) findViewById(R.id.taskView2BackButton);
    final Button btnClear= (Button) findViewById(R.id.taskView2ClearButton);
    final Button btnEdit = (Button) findViewById(R.id.taskView2EditButton);

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
