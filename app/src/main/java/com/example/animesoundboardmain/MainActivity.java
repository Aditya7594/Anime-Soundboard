package com.example.animesoundboardmain;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set immersive full-screen mode
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );


        Animation cardTouchAnimation = AnimationUtils.loadAnimation(this, R.anim.card_touch_scale);

        CardView cardOnePiece = findViewById(R.id.One_piece);
        if (cardOnePiece != null) {
            cardOnePiece.setOnTouchListener((view, motionEvent) -> {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    cardOnePiece.startAnimation(cardTouchAnimation); // Start touch animation
                }
                return false;
            });
            cardOnePiece.setOnClickListener(view -> {
                startActivity(new Intent(MainActivity.this, onepieceactivity.class));
                finish();
            });
        }

        // Find and configure the second card (Bleach)
        CardView cardBleach = findViewById(R.id.bleach);
        if (cardBleach != null) {
            cardBleach.setOnTouchListener((view, motionEvent) -> {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    cardBleach.startAnimation(cardTouchAnimation);
                }
                return false;
            });
            cardBleach.setOnClickListener(view -> {
                startActivity(new Intent(MainActivity.this, bleachactivity.class));
                finish();
            });
        }
    }
}


