package com.example.eag.servicios;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MyService extends Service {
    public MyService() {
    }

    public void onCreate(){
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Toast.makeText(this, "El sigue iniciado", Toast.LENGTH_SHORT).show();



        // Do some stuff
        return Service.START_STICKY;
    }




    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
