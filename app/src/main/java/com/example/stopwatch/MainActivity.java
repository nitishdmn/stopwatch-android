package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.Button;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView tvSplash,tvsubSplash;
    Button btnget;
    Animation atg;
   ImageView ivSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnget  = findViewById(R.id.btnget);
        btnget.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {
               Intent a = new Intent( MainActivity.this,StopWatchAct.class);
               a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
               startActivity(a);
           }
        });

       tvSplash = findViewById(R.id.tvSplash);
        tvsubSplash = findViewById(R.id.tvsubSplash);
        ivSplash =  findViewById(R.id.ivSplash);


//        Animation atg = AnimationUtils.loadAnimation(this,R.anim.atg);
//       ivSplash.startAnimation(atg);
//
//
//        Typeface MLight=  Typeface.createFromAsset(getAssets(), "fonts/MLight.trf");
//        Typeface MMedium=  Typeface.createFromAsset(getAssets(), "fonts/MMedium.trf");
//        Typeface MRegular=  Typeface.createFromAsset(getAssets(), "fonts/MRegular.trf");
//
//        tvSplash.setTypeface(MRegular);
//        tvsubSplash.setTypeface(MLight);
//        btnget.setTypeface(MMedium);

    }
}
