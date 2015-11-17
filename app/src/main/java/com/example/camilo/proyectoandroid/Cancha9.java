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

public class Cancha9 extends Activity {

    ArrayList<String> datos9 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.futbol9);

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
            String text = "Fuiste convocado para jugar un futbol 9 de arquero el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";
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
            String text = "Fuiste convocado para jugar un futbol 9 de defensor el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";
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
            String text = "Fuiste convocado para jugar un futbol 9 en " + lugar + " de mediocampista el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min + " ...Te pinta?";
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
            String text = "Fuiste convocado para jugar un futbol 9 de delantero el dia "+dia+"/"+mes+"/"+ano+" a las: " +hora+":"+min+" ...Te pinta?";
            PackageInfo info=pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }



    }

    public void Confirmar9(View v){

        EditText ed1c9= (EditText) findViewById(R.id.et1);
        EditText ed2c9= (EditText) findViewById(R.id.et2);
        EditText ed3c9= (EditText) findViewById(R.id.et3);
        EditText ed4c9= (EditText) findViewById(R.id.et4);
        EditText ed5c9= (EditText) findViewById(R.id.et5);
        EditText ed6c9= (EditText) findViewById(R.id.et6);
        EditText ed7c9= (EditText) findViewById(R.id.et7);
        EditText ed8c9= (EditText) findViewById(R.id.et8);
        EditText ed9c9= (EditText) findViewById(R.id.et9);


        EditText[] cancha9 = {ed1c9, ed2c9, ed3c9, ed4c9, ed5c9, ed6c9, ed7c9, ed8c9, ed9c9};
        String[] var9={"aux19","aux29","aux39","aux49","aux59","aux69","aux79","aux89","aux99"};

        for (int i=0;i<cancha9.length;i++){
            var9[i]=cancha9[i].getText().toString();
            datos9.add(var9[i]);
        }
        BaseDatos db = new BaseDatos();
        String arrayStr= db.covertArrayToString(datos9);
        db.cargar(this, arrayStr);
        me();
        finish();

    }
    private void me() {
        Intent i = new Intent(this, Inicio.class );
        startActivity(i);
    }
}
