package com.esenbaharturkay.exampletwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listview1;
    Button buttonlistgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listview1 = findViewById(R.id.listview1);
        createItemModelList();
        buttonlistgo = findViewById(R.id.buttonlistgo);
        ItemArrayAdapter adapter = new ItemArrayAdapter(createItemModelList(), this);
        listview1.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        buttonlistgo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                MapsIntent();



            }
        });
    }

    public ArrayList<Item> createItemModelList() {
        ArrayList<Item> itemModelArrayList = new ArrayList<>();
        Item itemModel1 = new Item("perfect", R.drawable.indir, 0);
        Item itemModel2 = new Item("perfect", R.drawable.indir, 0);
        Item itemModel3 = new Item("perfect", R.drawable.indir, 0);
        Item itemModel4 = new Item("perfect", R.drawable.indir, 0);
        Item itemModel5 = new Item("perfect", R.drawable.indir, 0);
        Item buttonItem = new Item(R.color.colorPrimary, R.color.colorAccent);
        itemModelArrayList.add(itemModel1);
        itemModelArrayList.add(itemModel2);
        itemModelArrayList.add(itemModel3);
        itemModelArrayList.add(itemModel4);
        itemModelArrayList.add(itemModel5);
        itemModelArrayList.add(buttonItem);


        return itemModelArrayList;
    }
    private void MapsIntent() {
        Intent Maps = new Intent(this,MapsActivity.class);

//
        startActivity(Maps);
//
    }
}
