package com.example.a17010233.todolist;

import java.util.Calendar;

/**
 * Created by 17010233 on 17/7/2018.
 */

public class DoItem {
    private String name;
    private Calendar date;

    public DoItem(String name, Calendar date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" +
                date.get(Calendar.MONTH) + "/" +
                date.get(Calendar.YEAR);
        return str;
    }


    @Override
    public String toString() {
        return "DoItem{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
