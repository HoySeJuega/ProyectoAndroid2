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
import android.widget.TimePicker;

public class Hora extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);



        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#448AFF"));
        getActionBar().setBackgroundDrawable(colorDrawable);


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.verde));


        
    }


    public static int hora,min;

    public void ConfirmarHora(View view){

        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.is24HourView();
        hora=timePicker.getCurrentHour();
        min=timePicker.getCurrentMinute();



        System.out.println(hora + ":" + min);
        salir();
    }

    private void salir() {
            Intent i = new Intent(this, Crear_E_Datos.class );
            startActivity(i);
        }

}
