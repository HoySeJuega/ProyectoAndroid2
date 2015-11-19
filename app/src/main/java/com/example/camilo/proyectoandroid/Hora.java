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
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;

import static com.example.camilo.proyectoandroid.Set_date.ano;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;

public class Hora extends Activity {
    public static String allfecha;
    public static String allhora;
    public static String canchaType;
    private ArrayList<String> datos5 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
        getActionBar().hide();
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.azul1));
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


            finish();
        }

}
