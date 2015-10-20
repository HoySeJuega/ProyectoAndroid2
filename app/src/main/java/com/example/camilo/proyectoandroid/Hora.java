package com.example.camilo.proyectoandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TimePicker;

public class Hora extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
    }

    public void ConfirmarHora(View view){

        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.is24HourView();
        int hora=timePicker.getCurrentHour();
        int min=timePicker.getCurrentMinute();



        System.out.println(hora + ":" + min);
        salir();
    }

    private void salir() {
        finish();
    }
}
