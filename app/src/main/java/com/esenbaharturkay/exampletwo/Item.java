package com.esenbaharturkay.exampletwo;

import android.support.annotation.DrawableRes;

public class Item {
     String mName;

     @DrawableRes int imageResource;
    int nextActivity;

    int firstButtonColor;
    int secondButtonColor;

    public Item(String mName, int imageResource,int nextActivity) {
        super();
        this.imageResource = imageResource;
        this.mName = mName;
        this.nextActivity = nextActivity;

    }

    public Item (int firstButtonColor,int secondButtonColor){
        this.firstButtonColor =firstButtonColor;
        this.secondButtonColor = secondButtonColor;
    }






}
