package com.example.camilo.proyectoandroid;


import static com.example.camilo.proyectoandroid.Hora.hora;
import static com.example.camilo.proyectoandroid.Hora.min;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;
import static com.example.camilo.proyectoandroid.Set_date.ano;
import android.app.ActionBar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Crear_E_Datos extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_e_datos);

        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#448AFF"));
        getActionBar().setBackgroundDrawable(colorDrawable);


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.verde));


    }
    public void dia(View v) {
        Intent i = new Intent(this, Set_date.class );
        startActivity(i);
    }


    public void hora(View View) {
        Intent i= new Intent(this, Hora.class);
        startActivity(i);
    }

    OnW



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_crear__e__datos, menu);
        return true;



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
