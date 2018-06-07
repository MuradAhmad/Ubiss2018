package com.androidapps.muradahmad.calmify;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by muradahmad on 07/06/2018.
 */

public class Play extends AppCompatActivity {
    public int counter;
    Button play;
    TextView txtTimer;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_pause);
        play= (Button) findViewById(R.id.btnPlay);
        txtTimer= (TextView) findViewById(R.id.textView);
        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                play.setText("Pause");

                new CountDownTimer(60000, 1000){
                    public void onTick(long millisUntilFinished){
                        txtTimer.setText(String.valueOf(counter));
                        counter++;
                    }
                    public  void onFinish(){
                        txtTimer.setText("FINISH!!");
                    }
                }.start();
            }
        });
    }



}
