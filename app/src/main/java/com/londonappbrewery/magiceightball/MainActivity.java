package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball = findViewById(R.id.image_again);
        final Button  ask = findViewById(R.id.ASK);
        final int[] ballArray ={R.drawable.ball1 ,R.drawable.ball2 ,R.drawable.ball3 ,R.drawable.ball4 ,R.drawable.ball5};
        for(int i=0;i<5;i++){
            Log.d("ball", "memory locarion == "+ ballArray[i]);
        }
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rans= new Random();
                int number = rans.nextInt(5);
                ball.setImageResource(ballArray[number]);

                Log.d("ball", "dise number == "+ ballArray[number]);
                Log.d("ball", "random number == "+ number);

            }
        });
    }
}
