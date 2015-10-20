package com.example.camilo.proyectoandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

public class Set_date extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dia);

    }



public void Confirmar(View view){

    DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);
    int dia=datePicker.getDayOfMonth();
    int mes =datePicker.getMonth()+1;
    int ano =datePicker.getYear();

    System.out.println(dia + " " + mes + " " + ano);
    salir();
}
    private void salir() {
        finish();
    }
}
