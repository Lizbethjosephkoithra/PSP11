package com.myapplicationdev.psp11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<String> {
    Context context;
    private String[] items;


    public ItemAdapter(Context context, int resource, String[]  objects) {
        super(context, resource, objects);
        this.context = context;
        items = objects;

    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_row, parent, false);

        //Match the UI components with Java variables
        TextView tv = rowView.findViewById(R.id.tv);
        ImageView ivImage = rowView.findViewById(R.id.iv);

        //note position
        String currItem = items[position];
        tv.setText(items[position]);

        if (currItem.equalsIgnoreCase("bio")){
            ivImage.setImageResource(R.drawable.info);
        }
        else if (currItem.equalsIgnoreCase("vaccination")){
            ivImage.setImageResource(R.drawable.edit);
        }
        else if (currItem.equalsIgnoreCase("anniversary")){
            ivImage.setImageResource(R.drawable.gift);
        }
        else if (currItem.equalsIgnoreCase("about us")){
            ivImage.setImageResource(R.drawable.star);
        }
        return rowView;


    }


}
