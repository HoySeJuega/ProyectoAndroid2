package com.example.camilo.proyectoandroid;

import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.camilo.proyectoandroid.Crear_E_Datos.lugar;
import static com.example.camilo.proyectoandroid.Hora.hora;
import static com.example.camilo.proyectoandroid.Hora.min;
import static com.example.camilo.proyectoandroid.Set_date.ano;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;

public class Cancha7 extends Activity {

    ArrayList<String> datos7 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.futbol7);

        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00897B"));
        getActionBar().setBackgroundDrawable(colorDrawable);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.azul1));

    }


    public void Arquero(View View) {
        PackageManager pm = getPackageManager();
        try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "Fuiste convocado para jugar un futbol 7 de arquero el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";
            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    public void Defensor(View View) {
        PackageManager pm = getPackageManager();
        try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "Fuiste convocado para jugar un futbol 7 de defensor el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";
            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }


    }

    public void Mediocampo(View v) {
        PackageManager pm = getPackageManager();
        try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "Fuiste convocado para jugar un futbol 7 en " + lugar + " de mediocampista el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min + " ...Te pinta?";
            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }
    }


    public void Delantero(View v) {
        PackageManager pm=getPackageManager();
        try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "Fuiste convocado para jugar un futbol 7 de delantero el dia "+dia+"/"+mes+"/"+ano+" a las: " +hora+":"+min+" ...Te pinta?";
            PackageInfo info=pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }

    }

    public void Confirmar7(View v){

        EditText ed1c7= (EditText) findViewById(R.id.eT1);
        EditText ed2c7= (EditText) findViewById(R.id.eT2);
        EditText ed3c7= (EditText) findViewById(R.id.eT3);
        EditText ed4c7= (EditText) findViewById(R.id.eT4);
        EditText ed5c7= (EditText) findViewById(R.id.eT5);
        EditText ed6c7= (EditText) findViewById(R.id.eT6);
        EditText ed7c7= (EditText) findViewById(R.id.eT7);


        EditText[] cancha7 = {ed1c7, ed2c7, ed3c7, ed4c7, ed5c7, ed6c7, ed7c7};
        String[] var7={"aux17","aux27","aux37","aux47","aux57","aux67","aux77"};

        for (int i=0;i<cancha7.length;i++){
            var7[i]=cancha7[i].getText().toString();
            datos7.add(var7[i]);
        }

        BaseDatos db = new BaseDatos();
        String arrayStr= db.covertArrayToString(datos7);
        db.cargar(this, arrayStr);
        me();
        finish();

    }
    private void me() {
        Intent i = new Intent(this, Inicio.class );
        startActivity(i);
    }

}
