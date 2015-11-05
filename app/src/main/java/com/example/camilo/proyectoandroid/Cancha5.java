package com.example.camilo.proyectoandroid;


import static com.example.camilo.proyectoandroid.Hora.hora;
import static com.example.camilo.proyectoandroid.Hora.min;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;
import static com.example.camilo.proyectoandroid.Set_date.ano;
import static com.example.camilo.proyectoandroid.Crear_E_Datos.lugar;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cancha5 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.futbol5);

        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00695C"));
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
            String text = "Fuiste convocado para jugar un futbol 5 en "+lugar+" de arquero el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";

            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
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
            //                                               lugar esta en Crear_E_Datos
            String text = "Fuiste convocado para jugar un futbol 5 en "+lugar+" de defensor el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";

            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
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
            String text = "Fuiste convocado para jugar un futbol 5 en " + lugar + " de mediocampista el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min + " ...Te pinta?";

            PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
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
            String text = "Fuiste convocado para jugar un futbol 5 en "+lugar+" de delantero el dia "+dia+"/"+mes+"/"+ano+" a las: " +hora+":"+min+" ...Te pinta?";

            PackageInfo info=pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));

        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }

    }

    public void Confirmar5(View v){

        EditText ed1c5= (EditText) findViewById(R.id.eT1);
        EditText ed2c5= (EditText) findViewById(R.id.eT2);
        EditText ed3c5= (EditText) findViewById(R.id.eT3);
        EditText ed4c5= (EditText) findViewById(R.id.eT4);
        EditText ed5c5= (EditText) findViewById(R.id.eT5);

        String aux15,aux25,aux35,aux45,aux55;
        ArrayList<String> datos7 = new ArrayList<>();

        String[] cancha5 ={"ed1c5", "ed2c5", "ed3c5", "ed4c5", "ed5c5"};
       /*
        aux15=ed1c7.getText().toString();
        aux25=ed2c7.getText().toString();
        aux35=ed3c7.getText().toString();
        aux45=ed4c7.getText().toString();
        aux55=ed5c7.getText().toString();

        datos7.add(aux15);
        datos7.add(aux25);
        datos7.add(aux35);
        datos7.add(aux45);
        datos7.add(aux55);

*/
        System.out.println(datos7);

    }




}
