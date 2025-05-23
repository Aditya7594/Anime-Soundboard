package com.example.animesoundboardmain;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.Button;
import android.content.Intent;

public class loading_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_page);

        // Set up VideoView
        VideoView videoView = findViewById(R.id.loading_player);
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.loading);
        videoView.setVideoURI(videoUri);

        // Loop video seamlessly
        videoView.setOnPreparedListener(mp -> {
            mp.setLooping(true);
            videoView.start();
        });

        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(view -> {
            startActivity(new Intent(loading_page.this, MainActivity.class));
            finish();
        });
    }
}
