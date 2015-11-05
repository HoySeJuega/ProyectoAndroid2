package com.example.camilo.proyectoandroid;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.camilo.proyectoandroid.Crear_E_Datos.lugar;
import static com.example.camilo.proyectoandroid.Hora.hora;
import static com.example.camilo.proyectoandroid.Hora.min;
import static com.example.camilo.proyectoandroid.Set_date.ano;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;

public class Cancha11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.futbol11);
    }









    public void Arquero(View View) {
        PackageManager pm = getPackageManager();
        try {

            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "Fuiste convocado para jugar un futbol 11 de arquero el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";

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
            String text = "Fuiste convocado para jugar un futbol 11 de defensor el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";

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
            String text = "Fuiste convocado para jugar un futbol 11 en " + lugar + " de mediocampista el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min + " ...Te pinta?";

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
            String text = "Fuiste convocado para jugar un futbol 11 de delantero el dia "+dia+"/"+mes+"/"+ano+" a las: " +hora+":"+min+" ...Te pinta?";

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


    public void Confirmar11(View v){

        EditText ed1c11= (EditText) findViewById(R.id.et1c11);
        EditText ed2c11= (EditText) findViewById(R.id.et2c11);
        EditText ed3c11= (EditText) findViewById(R.id.et3c11);
        EditText ed4c11= (EditText) findViewById(R.id.et4c11);
        EditText ed5c11= (EditText) findViewById(R.id.et5c11);
        EditText ed6c11= (EditText) findViewById(R.id.et6c11);
        EditText ed7c11= (EditText) findViewById(R.id.et7c11);
        EditText ed8c11= (EditText) findViewById(R.id.et8c11);
        EditText ed9c11= (EditText) findViewById(R.id.et9c11);
        EditText ed10c11= (EditText) findViewById(R.id.et10c11);
        EditText ed11c11= (EditText) findViewById(R.id.et11c11);

        String aux111,aux211,aux311,aux411,aux511,aux611,aux711,aux811,aux911,aux1011,aux1111;
        ArrayList<String> datos7 = new ArrayList<>();

        aux111=ed1c11.getText().toString();
        aux211=ed2c11.getText().toString();
        aux311=ed3c11.getText().toString();
        aux411=ed4c11.getText().toString();
        aux511=ed5c11.getText().toString();
        aux611=ed6c11.getText().toString();
        aux711=ed7c11.getText().toString();
        aux811=ed8c11.getText().toString();
        aux911=ed9c11.getText().toString();
        aux1011=ed10c11.getText().toString();
        aux1111=ed11c11.getText().toString();

        datos7.add(aux111);
        datos7.add(aux211);
        datos7.add(aux311);
        datos7.add(aux411);
        datos7.add(aux511);
        datos7.add(aux611);
        datos7.add(aux711);
        datos7.add(aux811);
        datos7.add(aux911);
        datos7.add(aux1011);
        datos7.add(aux1111);

        System.out.println(datos7);

    }


}
