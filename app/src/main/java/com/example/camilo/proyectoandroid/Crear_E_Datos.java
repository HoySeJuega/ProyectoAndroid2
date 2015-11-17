package com.example.camilo.proyectoandroid;


import static com.example.camilo.proyectoandroid.Hora.hora;
import static com.example.camilo.proyectoandroid.Hora.min;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;
import static com.example.camilo.proyectoandroid.Set_date.ano;
import android.app.ActionBar;
import android.app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class Crear_E_Datos extends Activity {

    public static String allfecha;
    public static String allhora;
    public static String canchaType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_e_datos);

        ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00897B"));
        getActionBar().setBackgroundDrawable(colorDrawable);


        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.azul1));
        TextView textView2 = (TextView) findViewById(R.id.editText2);
        TextView textView1 = (TextView) findViewById(R.id.editText);

         spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Formaciones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinner.setAdapter(adapter);


        if (dia!=0) {

            allfecha=dia + "/" + mes + "/" + ano;
            textView2.setText("Dia Seleccionado: "+allfecha);
        }

        if(hora!=0){


            allhora=hora + ":" + min;
            textView1.setText("Hora Escogida: "+ allhora);

        }

    }

    public static String lugar;
    public Spinner spinner;


    public void maps(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com.ar/maps/search/canchas+en+cordoba/@-31.361994,-64.2377467,13z"));
        startActivity(intent);

        Toast.makeText(getApplicationContext(), "Canchas de futbol en Cordoba",
                Toast.LENGTH_SHORT).show();
    }



    public void dia(View v) {
        Intent i = new Intent(this, Set_date.class );
        startActivity(i);

    }


    public void hora(View View) {
        Intent i= new Intent(this, Hora.class);
        startActivity(i);

    }


public void Confirmar(View v){

    int index = -1;
    String text;
    EditText lugards = (EditText) findViewById(R.id.editText3);
    lugar=lugards.getText().toString();
    text=spinner.getSelectedItem().toString();
    System.out.println(text);

    int j =spinner.getSelectedItemPosition();
    System.out.println(j);

    if(j==0){
            Intent b= new Intent(this, Cancha5.class);
            startActivity(b);
            canchaType="cancha 5";
            ;}

    if(j==1) {
        Intent a = new Intent(this, Cancha7.class);
        startActivity(a);
        canchaType="cancha 7";
        ;
    }
        if(j==2){
            Intent r= new Intent(this, Cancha9.class);
            startActivity(r);
            canchaType="cancha 9";
            ;}
       if(j==3){
            Intent t= new Intent(this, Cancha11.class);
            startActivity(t);
           canchaType="cancha 11";
           ;
    }
}


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
