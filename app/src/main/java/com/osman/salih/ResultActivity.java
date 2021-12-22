package com.osman.salih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class ResultActivity extends AppCompatActivity {

    MaterialCardView home;
    TextView correctt, wrongt, resultinfo, yourscore;
    ImageView resultImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        home = findViewById(R.id.returnHome);
        correctt = findViewById(R.id.correctt);
        wrongt = findViewById(R.id.wrongt);
        resultinfo = findViewById(R.id.resultInfo);
        resultImage = findViewById(R.id.resultImage);
        yourscore = findViewById(R.id.yourScore);


        int correct = getIntent().getIntExtra("correct",0);
        int wrong = getIntent().getIntExtra("wrong",0);

        correctt.setText("Correct\n " + correct);
        wrongt.setText("Wrong\n " + wrong);

        yourscore.setText("Your Score: " +  String.format("%d", correct * 5));

        if (correct >= 0 && correct <= 5) {
            resultinfo.setText("You have to take the test again");
            resultImage.setImageResource(R.drawable.ic_sad_face);
        } else if (correct >= 5 && correct <= 13) {
            resultinfo.setText("You have to try a little more");
            resultImage.setImageResource(R.drawable.ic_neutral_face);
        } else if (correct >= 13 && correct <= 18) {
            resultinfo.setText("You're pretty good");
            resultImage.setImageResource(R.drawable.ic_smile_face);
        } else {
            resultinfo.setText("You are very good congratulations");
            resultImage.setImageResource(R.drawable.ic_smile_face);
        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cnn = new Intent( ResultActivity.this, MainActivity.class );
                startActivity( cnn );
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent cnn = new Intent( ResultActivity.this, MainActivity.class );
        startActivity( cnn );
        finish();
    }
}