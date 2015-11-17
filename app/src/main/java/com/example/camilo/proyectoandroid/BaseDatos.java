package com.example.camilo.proyectoandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import static com.example.camilo.proyectoandroid.Crear_E_Datos.allfecha;
import static com.example.camilo.proyectoandroid.Crear_E_Datos.allhora;
import static com.example.camilo.proyectoandroid.Crear_E_Datos.lugar;
import static com.example.camilo.proyectoandroid.Crear_E_Datos.canchaType;

import java.util.ArrayList;
import java.util.Currency;

/**
 * Created by camilo on 10/11/15.
 */
public class BaseDatos{

    String fecha=allfecha;
    String hora=allhora;

    public static String strSeparator="_,_";
    public static String covertArrayToString(ArrayList<String> aString){
        String arrayStr="";
        for (int i = 0;i<aString.size(); i++){
            arrayStr= arrayStr+aString.get(i);
            if(i<aString.size()-1){
                arrayStr = arrayStr+strSeparator;

            }
        }
        return arrayStr;
    }

    public void cargar(Context context , String arrayStr) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context ,"equiposCreados");
        SQLiteDatabase db = admin.getWritableDatabase();
        ContentValues guardar = new ContentValues();
        System.out.println(hora);
        System.out.println(fecha);
        guardar.put("tipo", canchaType);
        guardar.put("jugadores",arrayStr);
        guardar.put("hora",hora);
        guardar.put("fecha",fecha);
        guardar.put("lugar", lugar);
        db.insert("equiposCreados", null, guardar);
        db.close();
        System.out.println("CARGOOOOOOOOOO");
    }

    public void modificar(Context context, int index, String tcancha,String arrayJug,String hora,String fecha,String lugar){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(context ,"equiposCreados");
        SQLiteDatabase db = admin.getWritableDatabase();
        ContentValues modificar = new ContentValues();
        modificar.put("tipo", tcancha);
        modificar.put("jugadores", arrayJug);
        modificar.put("hora", hora);
        modificar.put("fecha", fecha);
        modificar.put("lugar", lugar);
        db.update("equiposCreados", modificar, "id =" + index, null);
        db.close();
        System.out.println("modificado");
    }


    public void leer(Context context, int index){
        AdminSQLiteOpenHelper adminr = new AdminSQLiteOpenHelper(context, "equiposCreados");
        SQLiteDatabase bd = adminr.getReadableDatabase();
        Cursor f = bd.rawQuery("select * from equiposCreados where id =" + index, null);
        f.moveToFirst();

        ArrayList<String> arrayString = new ArrayList<>();
        for (int i = 1; i < 6 ; i++) {
            arrayString.add(f.getString(i));
        }
    }


}
