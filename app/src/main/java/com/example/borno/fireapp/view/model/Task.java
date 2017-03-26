package com.example.borno.fireapp.view.model;

import android.icu.text.TimeZoneFormat;

import java.lang.reflect.Constructor;
import java.text.DateFormat;

/**
 * Created by borno on 20/03/2017.
 */

public class Task {
    private String picture;
    private String taskname;
    private String taskdate;
    private String taskTime;
    private String taskPlace;

    public Task(String picture, String taskName, String taskdate, String tasktime, String taskplace){
        this.picture = picture;
        this.taskname = taskName;
        this.taskdate = taskdate;
        this.taskTime = tasktime;
        this.taskPlace = taskplace;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(String taskdate) {
        this.taskdate = taskdate;
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime;
    }

    public String getTaskPlace() {
        return taskPlace;
    }

    public void setTaskPlace(String taskPlace) {
        this.taskPlace = taskPlace;
    }
}
