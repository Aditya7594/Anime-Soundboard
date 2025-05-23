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

public class onepieceactivity extends AppCompatActivity {

    private MediaPlayer currentMediaPlayer;
    private ImageView currentImageView;
    private Animation rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_piece);

        ImageView backbutton = findViewById(R.id.back_button);
        backbutton.setOnClickListener(view -> navigateToMainActivity());

        ImageView luffy1 = findViewById(R.id.luffy1);
        ImageView bigmom = findViewById(R.id.bigmom);
        ImageView Zoro = findViewById(R.id.Zoro1);
        ImageView sanji = findViewById(R.id.sanji1);
        ImageView crocodile = findViewById(R.id.crocodile1);
        ImageView doflamingo = findViewById(R.id.doflamingo1);
        ImageView Zoro1 = findViewById(R.id.Zoro1);
        ImageView blackbeard = findViewById(R.id.blackbeard1);
        ImageView Kaido = findViewById(R.id.Kaido1);
        ImageView brook = findViewById(R.id.brook1);
        ImageView Nami = findViewById(R.id.Nami1);
        ImageView kuma = findViewById(R.id.kuma1);
        ImageView transpondersnail = findViewById(R.id.transpondersnail1);
        ImageView crocodile2 = findViewById(R.id.crocodile2);
        ImageView franky = findViewById(R.id.franky1);
        ImageView kidluffy1 = findViewById(R.id.kidluffy1);
        ImageView law1 = findViewById(R.id.Law1);
        ImageView luffygear5_1 = findViewById(R.id.luffygear5_1);
        ImageView luffygear5_2 = findViewById(R.id.luffygear5_2);
        ImageView Perona1 = findViewById(R.id.Perona1);
        ImageView sanji2 = findViewById(R.id.sanji2);
        ImageView law2 = findViewById(R.id.law2);
        ImageView wb1 = findViewById(R.id.Wb1);
        ImageView zoro2 = findViewById(R.id.zoro2);
        ImageView zoro3 = findViewById(R.id.zoro3);
        ImageView zoro4 = findViewById(R.id.zoro4);



        luffy1.setImageBitmap(loadImageFromAssets("Onepiece/luffy.jpeg"));
        bigmom.setImageBitmap(loadImageFromAssets("Onepiece/bigmom.jpg"));
        Zoro.setImageBitmap(loadImageFromAssets("Onepiece/zoro.jpeg"));
        sanji.setImageBitmap(loadImageFromAssets("Onepiece/sanji.jpeg"));
        crocodile.setImageBitmap(loadImageFromAssets("Onepiece/crocodile.jpeg"));
        doflamingo.setImageBitmap(loadImageFromAssets("Onepiece/doflamingo.jpeg"));
        brook.setImageBitmap(loadImageFromAssets("Onepiece/brook.jpeg"));
        Kaido.setImageBitmap(loadImageFromAssets("Onepiece/Kaido.jpg"));
        blackbeard.setImageBitmap(loadImageFromAssets("Onepiece/blackbeard.jpeg"));
        Nami.setImageBitmap(loadImageFromAssets("Onepiece/nami.jpeg"));
        kuma.setImageBitmap(loadImageFromAssets("Onepiece/kuma.jpeg"));
        transpondersnail.setImageBitmap(loadImageFromAssets("Onepiece/transponder_snail.jpeg"));
        crocodile2.setImageBitmap(loadImageFromAssets("Onepiece/crocodile.jpeg"));
        franky.setImageBitmap(loadImageFromAssets("Onepiece/franky_superrrr.jpeg"));
        kidluffy1.setImageBitmap(loadImageFromAssets("Onepiece/kid_luffy.jpeg"));
        law1.setImageBitmap(loadImageFromAssets("Onepiece/law_room.jpeg"));
        luffygear5_1.setImageBitmap(loadImageFromAssets("Onepiece/luffy_gear5.jpeg"));
        luffygear5_2.setImageBitmap(loadImageFromAssets("Onepiece/luffy_gear5_laugh.jpg"));
        Perona1.setImageBitmap(loadImageFromAssets("Onepiece/perona_laughs.jpeg"));
        sanji2.setImageBitmap(loadImageFromAssets("Onepiece/sanji_diable_jambe.jpg"));
        law2.setImageBitmap(loadImageFromAssets("Onepiece/shambles_trafalgar_Law.jpeg"));
        wb1.setImageBitmap(loadImageFromAssets("Onepiece/wb _one _piece _is _real.jpg"));
        zoro2.setImageBitmap(loadImageFromAssets("Onepiece/zoro_santoryu.jpeg"));
        zoro3.setImageBitmap(loadImageFromAssets("Onepiece/zoro_shouting_luffy.jpeg"));
        zoro4.setImageBitmap(loadImageFromAssets("Onepiece/zoro.jpeg"));







        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        luffy1.setOnClickListener(view -> handleCharacterClick(luffy1, "Onepiece/luffy_sound.wav"));
        bigmom.setOnClickListener(view -> handleCharacterClick(bigmom, "Onepiece/bigmom_sound.wav"));
        Zoro.setOnClickListener(view -> handleCharacterClick(Zoro, "Onepiece/zorooath_sound.wav"));
        sanji.setOnClickListener(view -> handleCharacterClick(sanji, "Onepiece/sanji_sound.wav"));
        crocodile.setOnClickListener(view -> handleCharacterClick(crocodile, "Onepiece/crocodile_sound.wav"));
        doflamingo.setOnClickListener(view -> handleCharacterClick(doflamingo, "Onepiece/doflamingo.wav"));
        brook.setOnClickListener(view -> handleCharacterClick(brook, "Onepiece/brooklaugh.wav"));
        Kaido.setOnClickListener(view -> handleCharacterClick(Kaido, "Onepiece/kaido.wav"));
        blackbeard.setOnClickListener(view -> handleCharacterClick(blackbeard, "Onepiece/blackbeard.wav"));
        Nami.setOnClickListener(view -> handleCharacterClick(Nami, "Onepiece/Nami.wav"));
        transpondersnail.setOnClickListener(view -> handleCharacterClick(transpondersnail, "Onepiece/transponder_snail.wav"));
        kuma.setOnClickListener(view -> handleCharacterClick(kuma, "Onepiece/kuma.wav"));
        crocodile2.setOnClickListener(view -> handleCharacterClick(crocodile2, "Onepiece/Crocodile_hisashiburi _ana_mugiwara.wav"));
        franky.setOnClickListener(view -> handleCharacterClick(franky, "Onepiece/franky_superrrr.wav"));
        kidluffy1.setOnClickListener(view -> handleCharacterClick(kidluffy1, "Onepiece/kid_luffy_laugh.wav"));
        law1.setOnClickListener(view -> handleCharacterClick(law1, "Onepiece/Law _Roommm.wav"));
        luffygear5_1.setOnClickListener(view -> handleCharacterClick(luffygear5_1, "Onepiece/luffy_gear5.wav"));
        luffygear5_2.setOnClickListener(view -> handleCharacterClick(luffygear5_2, "Onepiece/luffy_gear5_laugh.wav"));
        Perona1.setOnClickListener(view -> handleCharacterClick(Perona1, "Onepiece/perona_laughs.wav"));
        sanji2.setOnClickListener(view -> handleCharacterClick(sanji2, "Onepiece/Sanji_diable _jambē.wav"));
        law2.setOnClickListener(view -> handleCharacterClick(law2, "Onepiece/shambles_trafalgar_Law.wav"));
        wb1.setOnClickListener(view -> handleCharacterClick(wb1, "Onepiece/WB _one _piece _is _real.wav"));
        zoro2.setOnClickListener(view -> handleCharacterClick(zoro2, "Onepiece/zoro_santoryu.wav"));
        zoro3.setOnClickListener(view -> handleCharacterClick(zoro3, "Onepiece/zoro_shouting_luffy.wav"));
        zoro4.setOnClickListener(view -> handleCharacterClick(zoro4, "Onepiece/Zoro_name.wav"));

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
        // Explicitly start the MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish(); // Finish current activity
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (currentMediaPlayer != null) {
            currentMediaPlayer.release();
        }
    }
}
