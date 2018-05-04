package com.cornez.employeetracker;

// This class is designed to store data over the course of the app
public class Employee
{
    private int _id;
    private String _name;
    private String _task1;
    private String _task2;
    private boolean _onTask;
    private boolean _isTracked;

    public Employee()
    {
        _id = 0;
        _name = "Default Employeeman";
        _task1 = "The first thing.";
        _task2 = "The second thing.";
        _onTask = false;
        _isTracked = false;
    }

    public Employee(int id, String name, String task1, String task2)
    {
        _id = id;
        _name = name;
        _task1 = task1;
        _task2 = task2;
        _onTask = false;
        _isTracked = false;
    }

    //Getters
    public int getId()
    {
        return this._id;
    }

    public String getName()
    {
        return this._name;
    }

    public String getTask1()
    {
        return this._task1;
    }

    public String getTask2()
    {
        return this._task2;
    }

    public boolean getOnTask()
    {
        return  this._onTask;
    }

    public boolean getIsTracked()
    {
        return this._isTracked;
    }

    //Setters
    public void setId(int id)
    {
        this._id = id;
    }

    public void setName(String name)
    {
        this._name = name;
    }

    public void setTask1(String task)
    {
        this._task1 = task;
    }

    public void setTask2(String task)
    {
        this._task2 = task;
    }

    public void setOnTask(boolean onTask)
    {
        this._onTask = onTask;
    }

    public void setIsTracked(boolean isTracked)
    {
        this._isTracked = isTracked;
    }

    //Methods
    public void completeTask(int whichTask)
    {
        if (whichTask == 0)
        {
            this._task1 = "Completed: " + this._task1;
        }
        else
        {
            this._task2 = "Completed: " + this._task2;
        }
    }

    public void disableTracking()
    {
        this.setIsTracked(false);
    }
}