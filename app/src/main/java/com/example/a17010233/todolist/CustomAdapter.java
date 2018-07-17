package com.example.a17010233.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010233 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<DoItem> itemList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<DoItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        itemList = objects;
    }

    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        DoItem currentItem = itemList.get(position);

        String name = currentItem.getName();
        String date = currentItem.getDateString();
        tvName.setText(name);
        tvDate.setText(date);



        return rowView;
    }
}
