package com.example.animesoundboardmain;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;
import java.io.InputStream;

public class bleachactivity extends AppCompatActivity {

    private MediaPlayer currentMediaPlayer;
    private ImageView currentImageView;
    private Animation rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bleach);

        ImageView backbutton = findViewById(R.id.back_button);
        backbutton.setOnClickListener(view -> navigateToMainActivity());

        ImageView yamamoto1 = findViewById(R.id.yamamoto1);
        ImageView ichigo1 = findViewById(R.id.ichigo1);

        yamamoto1.setImageBitmap(loadImageFromAssets("bleach/yamamoto.jpeg"));
        ichigo1.setImageBitmap(loadImageFromAssets("bleach/ichigo.jpeg"));

        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        yamamoto1.setOnClickListener(view -> handleCharacterClick(yamamoto1, "bleach/yamamoto-bankai.wav"));
        ichigo1.setOnClickListener(view -> handleCharacterClick(ichigo1, "bleach/bankai-ichigo.wav"));
    }

    private Bitmap loadImageFromAssets(String imageName) {
        try (InputStream inputStream = getAssets().open(imageName)) {
            return BitmapFactory.decodeStream(inputStream);
        } catch (IOException e) {
            return null;
        }
    }

    private void handleCharacterClick(ImageView imageView, String audioFile) {
        if (currentMediaPlayer != null && currentMediaPlayer.isPlaying()) {
            currentMediaPlayer.stop();
            currentMediaPlayer.release();
            currentImageView.clearAnimation();
        }

        imageView.startAnimation(rotate);
        playAudio(audioFile);
        currentMediaPlayer.setOnCompletionListener(mp -> imageView.clearAnimation());
        currentImageView = imageView;
    }

    private void playAudio(String audioFile) {
        try {
            currentMediaPlayer = new MediaPlayer();
            AssetFileDescriptor afd = getAssets().openFd(audioFile);
            currentMediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            currentMediaPlayer.prepare();
            currentMediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        navigateToMainActivity();
    }

    private void navigateToMainActivity() {
        if (currentMediaPlayer != null) {
            currentMediaPlayer.stop();
            currentMediaPlayer.release();
            if (currentImageView != null) {
                currentImageView.clearAnimation();
            }
        }
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (currentMediaPlayer != null) {
            currentMediaPlayer.release();
        }
    }
}
