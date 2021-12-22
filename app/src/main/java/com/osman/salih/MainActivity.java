package com.osman.salih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    MaterialCardView topics, videos, quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topics = findViewById(R.id.mtopicCard);
        topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TopicsActivity.class));
                finish();
            }
        });

        videos = findViewById(R.id.mvideoCard);
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoActivity.class));
                finish();
            }
        });

        quiz = findViewById(R.id.mquizCard);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuizActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        MaterialAlertDialogBuilder mBuilder = new MaterialAlertDialogBuilder(this, R.style.BackDialog);
        mBuilder.setTitle(R.string.app_name);
        mBuilder.setMessage(R.string.back_button);
        mBuilder.setNegativeButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        mBuilder.setPositiveButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        mBuilder.show();
    }
}