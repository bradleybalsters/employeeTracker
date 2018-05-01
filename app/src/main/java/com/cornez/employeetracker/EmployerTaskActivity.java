package com.cornez.employeetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmployerTaskActivity extends AppCompatActivity
{
    Button btnClear;
    Button btnEdit;
    Button btnBack;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);

        btnClear = (Button) findViewById(R.id.taskViewClearButton);
        btnEdit = (Button) findViewById(R.id.taskViewEditButton);
        btnBack = (Button) findViewById(R.id.taskViewBackButton);
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

                }
                if (v == btnEdit)
                {

                }
                if (v == btnBack)
                {
                    Intent intentMain = new Intent(EmployerTaskActivity.this,
                            EmployerViewActivity.class);
                    EmployerTaskActivity.this.startActivity(intentMain);
                }
            }
        };

        btnEdit.setOnClickListener(handler);
        btnClear.setOnClickListener(handler);
        btnBack.setOnClickListener(handler);
    }
}
