package com.example.a17010233.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvThings;

    ArrayList<DoItem> alThingList;

    CustomAdapter caThings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvThings = findViewById(R.id.listViewName);

        alThingList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);

        DoItem item1 = new DoItem("MSA", date1);
        DoItem item2 = new DoItem("Go for haircut", date2);
        alThingList.add(item1);
        alThingList.add(item2);

        caThings = new CustomAdapter(this, R.layout.do_item, alThingList);

        lvThings.setAdapter(caThings);





    }
}
