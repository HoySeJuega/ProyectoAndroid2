package com.example.camilo.proyectoandroid;

import android.app.ActionBar;
import android.os.Bundle;
import android.app.Activity;

public class About extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getActionBar().hide();



    }

}
