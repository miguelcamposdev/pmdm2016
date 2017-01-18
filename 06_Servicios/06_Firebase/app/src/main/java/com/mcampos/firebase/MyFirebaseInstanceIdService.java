package com.mcampos.firebase;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by miguelcampos on 17/1/17.
 */

public class MyFirebaseInstanceIdService
        extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("FIREBASE", "Refreshed token: " + refreshedToken);

        // Guardar en preferencias el Token
        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("PREFS_FIREBASE",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("token", refreshedToken);
        editor.commit();

    }
}
