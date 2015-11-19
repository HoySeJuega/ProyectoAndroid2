package com.example.camilo.proyectoandroid;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Equipos_Creados extends Activity {

        public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.equipos_creados);


        final ActionBar bar = getActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00796B"));
        getActionBar().setBackgroundDrawable(colorDrawable);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.azul1));


        listView = (ListView) findViewById(R.id.lv1);
        final BaseDatos dbase = new BaseDatos();
        //dbase.listar(getApplicationContext(), listView);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        listar(this,listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String[] tipoCancha;
                tipoCancha = listView.getItemAtPosition(position).toString().split(" - Cancha de:  ");
                String selectCancha=tipoCancha[1].toString();
                int index = Integer.parseInt(tipoCancha[0]);

                switch (selectCancha){
                    case "cancha 5":
                        Intent i = new Intent(getBaseContext(), Modif5.class);
                        startActivity(i);
                        break;
                    case "cancha 7":
                        Intent a = new Intent(getBaseContext(), Modif7.class);
                        startActivity(a);
                        break;
                    case "cancha 9":
                        Intent b = new Intent(getBaseContext(),Modif9.class);
                        startActivity(b);
                        break;
                    case "cancha 11":
                        Intent o = new Intent(getBaseContext(),Modif11.class);
                        startActivity(o);
                        break;
                }



            }
        });
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_equipos__creados, menu);
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

    public void listar(Context context,ListView listView) {
        try {
            AdminSQLiteOpenHelper adminr = new AdminSQLiteOpenHelper(context, "equiposCreados");
            SQLiteDatabase bd = adminr.getReadableDatabase();
            Cursor fila = bd.rawQuery("SELECT * from equiposCreados ORDER BY id", null);
            int cant = fila.getCount();
            int i = 0;
            fila.moveToFirst();
            String[] arr = new String[cant];

            if (fila.moveToFirst()) {
                do {
                    String linea = fila.getInt(0) + " - Cancha de:  " + fila.getString(1);
                    arr[i] = linea;
                    System.out.println(linea);
                    i++;
                } while (fila.moveToNext());
                {

                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, arr);
                listView.setAdapter(adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
