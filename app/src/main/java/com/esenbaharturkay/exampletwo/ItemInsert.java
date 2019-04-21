package com.esenbaharturkay.exampletwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ItemInsert extends AppCompatActivity {


    Button Resimekle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_insert);

        Resimekle = findViewById(R.id.Resimekle);

        Resimekle = findViewById(R.id.button);
        Resimekle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub





            }
        });

    }




}
