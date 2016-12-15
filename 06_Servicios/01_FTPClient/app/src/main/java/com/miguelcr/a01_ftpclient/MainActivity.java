package com.miguelcr.a01_ftpclient;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    // IP o nombre dominio del servidor ftp
    public static final String URL_FTP = "";
    public static final int URL_FTP_PORT = 21;
    FTPClient mFTPClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new FTPConnection().execute();
    }


    public class FTPConnection extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            mFTPClient = new FTPClient();
            // connecting to the host
            try {

                mFTPClient.connect("31.220.104.105", 21);
                boolean status = mFTPClient.login("u900134203", "123456789");

                if(status) {
                    Log.i("*** FTP ***","**** Conexión correcta");
                } else {
                    Log.i("*** FTP ***","**** Conexión incorrecta");
                }

                Log.i("*** DIR FTP ***","**** "+mFTPClient.printWorkingDirectory());

                // now check the reply code, if positive mean connection success
                if (FTPReply.isPositiveCompletion(mFTPClient.getReplyCode())) {
                    mFTPClient.setFileType(FTP.ASCII_FILE_TYPE);
                    mFTPClient.enterLocalPassiveMode();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }
}
