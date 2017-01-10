package com.miguelcr.firebaseusuarios;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;


/**
 * Created by Fran on 28/05/2016.
 */
public class Preferencias {

    public static SharedPreferences sp;


    public static boolean guardar(Context mContext, String file, String titulo, String texto)
    {
        sp = mContext.getSharedPreferences(
                file, Context.MODE_PRIVATE);

        SharedPreferences.Editor mEdit1 = sp.edit();

        mEdit1.putString(titulo, texto);

        return mEdit1.commit();
    }

    public static String obtener(Context mContext, String file, String titulo){
        sp = mContext.getSharedPreferences(
                file, Context.MODE_PRIVATE);
        return sp.getString(titulo, "0");
    }


    public static void limpia(Context mContext, String file){
        sp = mContext.getSharedPreferences(
                file, Context.MODE_PRIVATE);
        SharedPreferences.Editor mEdit1 = sp.edit();
        mEdit1.clear();
        mEdit1.commit();
    }

}
