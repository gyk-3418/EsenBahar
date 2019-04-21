package com.esenbaharturkay.exampletwo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemArrayAdapter extends BaseAdapter{

    ArrayList<Item> items;
    Context context;


    public ItemArrayAdapter(ArrayList<Item> items, Context context){
        this.items=items;
        this.context = context;

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Item item = items.get(position);
        final View view;

        if (item.imageResource != 0){
            view = View.inflate(context,R.layout.list_view_item,null);

            ImageView imageview = view.findViewById(R.id.ıtem_image);
            TextView textView = view.findViewById(R.id.ıtem_name_label);
            imageview.setImageResource(items.get(position).imageResource);
            textView.setText(items.get(position).mName);
        }else {
            view = View.inflate(context,R.layout.button_item,null);
           Button buttonLeft = view.findViewById(R.id.buttonLeft);
           Button buttonRight = view.findViewById(R.id.buttonRight);

           buttonLeft.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    view.setBackgroundResource(item.firstButtonColor);
               }
           });

            buttonRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setBackgroundResource(item.secondButtonColor);
                }
            });

        }



        return view;
    }
}
