package com.example.camilo.proyectoandroid;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;

import java.util.Calendar;

public class Set_date extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dia);
        getActionBar().hide();
        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00695C"));
        getActionBar().setBackgroundDrawable(colorDrawable);


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.azul1));



    }
public static int dia, mes, ano;


public void Confirmar(View view){
ColorDrawable colorDrawable2 = new ColorDrawable(Color.parseColor("#00695C"));
    DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
    
     dia=datePicker.getDayOfMonth();
     mes =datePicker.getMonth()+1;
     ano =datePicker.getYear();

    System.out.println(dia + " " + mes + " " + ano);


    salir();
}
    private void salir() {
        finish();
    }
}
