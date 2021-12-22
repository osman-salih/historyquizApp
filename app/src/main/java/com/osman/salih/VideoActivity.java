package com.osman.salih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        YouTubePlayerView yvideo1 = findViewById(R.id.youtubeVideo1);
        YouTubePlayerView yvideo2 = findViewById(R.id.youtubeVideo2);
        YouTubePlayerView yvideo3= findViewById(R.id.youtubeVideo3);
        YouTubePlayerView yvideo4 = findViewById(R.id.youtubeVideo4);
        YouTubePlayerView yvideo5= findViewById(R.id.youtubeVideo5);
        getLifecycle().addObserver(yvideo1);
        getLifecycle().addObserver(yvideo2);
        getLifecycle().addObserver(yvideo3);
        getLifecycle().addObserver(yvideo4);
        getLifecycle().addObserver(yvideo5);
    }


    @Override
    public void onBackPressed() {
        Intent cnn = new Intent( VideoActivity.this, MainActivity.class );
        startActivity( cnn );
        finish();
    }
}