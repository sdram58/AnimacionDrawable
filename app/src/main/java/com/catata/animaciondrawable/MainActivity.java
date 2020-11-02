package com.catata.animaciondrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivCheck;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivCheck = findViewById(R.id.ivCheck);

        //ivCheck.setBackgroundResource(R.drawable.animacion_check);
        //animationDrawable = (AnimationDrawable) ivCheck.getBackground();

        //animationDrawable.setOneShot(true);

        ivCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sol1();

                //sol2();

                //animationDrawable.start();
            }
        });
    }

    private void sol2() {
        ivCheck.setBackground(null);
        ivCheck.setBackgroundResource(R.drawable.animacion_check);
        animationDrawable = (AnimationDrawable) ivCheck.getBackground();
        animationDrawable.start();
    }

    private void sol1() {
        ivCheck.setBackgroundResource(R.drawable.animacion_check);
        animationDrawable = (AnimationDrawable) ivCheck.getBackground();
        animationDrawable.setOneShot(false);
        animationDrawable.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animationDrawable.stop();
            }
        },850);

    }
}