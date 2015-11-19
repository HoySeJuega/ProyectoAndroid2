package com.example.camilo.proyectoandroid;

import static com.example.camilo.proyectoandroid.Crear_E_Datos.lugar;
import static com.example.camilo.proyectoandroid.Hora.hora;
import static com.example.camilo.proyectoandroid.Hora.min;
import static com.example.camilo.proyectoandroid.Set_date.dia;
import static com.example.camilo.proyectoandroid.Set_date.mes;
import static com.example.camilo.proyectoandroid.Set_date.ano;
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Modif5 extends Activity {
    public static String allfecha;
    public static String allhora;
    public static String canchaType;
    private ArrayList<String> datos5 = new ArrayList<>();

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modif5);
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

        textView2 = (TextView) findViewById(R.id.eT1);
        textView2.setText(" ");



        TextView textView3 = (TextView) findViewById(R.id.eT3);
        textView3.setText(" ");


    }


    public void Arquero(View View) {
        PackageManager pm = getPackageManager();
        try {

            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "Fuiste convocado para jugar un futbol 5 en "+lugar+" de arquero el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";
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
            String text = "Fuiste convocado para jugar un futbol 5 en "+lugar+" de defensor el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min+" ...Te pinta?";
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
            String text = "Fuiste convocado para jugar un futbol 5 en " + lugar + " de mediocampista el dia " + dia + "/" + mes + "/" + ano + " a las: " + hora + ":" + min + " ...Te pinta?";
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
            String text = "Fuiste convocado para jugar un futbol 5 en "+lugar+" de delantero el dia "+dia+"/"+mes+"/"+ano+" a las: " +hora+":"+min+" ...Te pinta?";
            PackageInfo info=pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
            waIntent.setPackage("com.whatsapp");
            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));
        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                    .show();
        }

    }

    public void Confirmar5(View v){
        int a = 0;

        EditText ed1c5= (EditText) findViewById(R.id.editText4);
        EditText ed2c5= (EditText) findViewById(R.id.editText5);
        EditText ed3c5= (EditText) findViewById(R.id.editText6);
        EditText ed4c5= (EditText) findViewById(R.id.editText7);
        EditText ed5c5= (EditText) findViewById(R.id.editText8);


        EditText[] cancha5 = {ed1c5, ed2c5, ed3c5, ed4c5, ed5c5};
        String[] var5={"aux15","aux25","aux35","aux45","aux55"};

        for (int i=0;i<cancha5.length;i++){
            var5[i]=cancha5[i].getText().toString();
            datos5.add(var5[i]);
        }
        BaseDatos db = new BaseDatos();
        String arrayStr= db.covertArrayToString(datos5);
        db.cargar(this, arrayStr);
        me();
        finish();
    }

    private void me() {
        Intent i = new Intent(this, Inicio.class );
        startActivity(i);
    }

  /*  @Override
    protected void onResume() {
        super.onResume();

if (dia!=0) {
    TextView textView2 = (TextView) findViewById(R.id.eT1);
    allfecha = dia + "/" + mes + "/" + ano;
    textView2.setText("Dia Seleccionado: " + allfecha);

}
        if (hora!=0) {

            TextView textView3 = (TextView) findViewById(R.id.eT3);
            allhora = hora + ":" + min;
            textView3.setText("Hora Escogida: " + allhora);

        }

    }
*/
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
            canchaType="cancha 5";
            ;}

        if(j==1) {
            canchaType="cancha 7";
            ;
        }
        if(j==2){
            canchaType="cancha 9";
            ;}
        if(j==3){

            canchaType="cancha 11";
            ;
        }






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


