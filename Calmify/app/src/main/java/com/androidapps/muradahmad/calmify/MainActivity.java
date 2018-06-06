package com.androidapps.muradahmad.calmify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aware.Aware;
import com.aware.Screen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent aware = new Intent(this, Aware.class);
        startService(aware);


        Screen.setSensorObserver(new Screen.AWARESensorObserver()){

        };

       // Aware.startPlugin(this, package_name:"com.aware.plugin.fitbit");


    }
}
