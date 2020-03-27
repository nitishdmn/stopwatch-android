package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchAct extends AppCompatActivity {

Button btnstart, btnstop;

    Animation roundingalone;
    Animation stop;
    ImageView icanchor;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnstart = findViewById(R.id.btnstart);
        btnstop = findViewById(R.id.btnstop);
        icanchor = findViewById(R.id.icanchor);
        roundingalone  = AnimationUtils.loadAnimation(this,R.anim.roundingalone);
        stop = AnimationUtils.loadAnimation(this,R.anim.stop);
        timerHere = findViewById(R.id.timerHere);

        btnstop.setAlpha(0);
        btnstart.setAlpha(1);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                icanchor.startAnimation(roundingalone);
                btnstop.animate().alpha(1).translationY(-80).setDuration(360).start();
                btnstart.animate().alpha(0).setDuration(360).start();
                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.start();
            }
        });
        btnstop.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icanchor.startAnimation(stop);
                btnstart.animate().alpha(1).translationY(-40).setDuration(360).start();
                btnstop.animate().alpha(0).setDuration(360).start();
                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.stop();
            }
        }));
    }
}
