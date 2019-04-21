package com.esenbaharturkay.exampletwo;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class GelecekApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }


}
