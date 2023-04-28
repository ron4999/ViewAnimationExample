package com.longhoang.viewanimationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imgAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAnimation = findViewById(R.id.iv_image);

        Button btnZoom = findViewById(R.id.btn_zoom);
        btnZoom.setOnClickListener(view -> {
            zoomAnimation();
        });

        Button btnBlink = findViewById(R.id.btn_blink);
        btnBlink.setOnClickListener(view -> {
            blinkAnimation();
        });

        Button btnClockWise = findViewById(R.id.btn_clockwise);
        btnClockWise.setOnClickListener(view -> {
            clockWiseAnimation();
        });

        Button btnMove = findViewById(R.id.btn_move);
        btnMove.setOnClickListener(view -> {
            moveAnimation();
        });

        Button btnFade = findViewById(R.id.btn_fade);
        btnFade.setOnClickListener(view -> {
            fadeAnimation();
        });

        Button btnSlide = findViewById(R.id.btn_slide);
        btnSlide.setOnClickListener(view -> {
            slideAnimation();
        });

        Button btnMix = findViewById(R.id.btn_clockwise_translate);
        btnMix.setOnClickListener(view -> {
            mixAnimation();
        });
        
        imgAnimation.setOnClickListener(view -> {
            Toast.makeText(this, "This is image", Toast.LENGTH_SHORT).show();
        });
    }

    private void blinkAnimation() {
        Animation animationBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        imgAnimation.startAnimation(animationBlink);
    }

    private void mixAnimation() {
        Animation animationMix = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwisetranslate);
        imgAnimation.startAnimation(animationMix);
    }

    private void clockWiseAnimation() {
        Animation animationClockWise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        imgAnimation.startAnimation(animationClockWise);
    }

    private void moveAnimation() {
        Animation animationMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        imgAnimation.startAnimation(animationMove);
    }

    private void fadeAnimation() {
        Animation animationFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        imgAnimation.startAnimation(animationFade);
    }

    private void slideAnimation() {
        Animation animationSlide = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        imgAnimation.startAnimation(animationSlide);
    }

    private void zoomAnimation() {
        Animation animationZoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        imgAnimation.startAnimation(animationZoom);
    }
}