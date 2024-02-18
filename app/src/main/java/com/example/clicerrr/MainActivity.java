package com.example.clicerrr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    ImageButton mainBtn;
    ImageButton imageButton;

    private long score = 0;
    String s;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn = (ImageButton) findViewById(R.id.plusButton);
        mainBtn.setOnClickListener(clickListener);
        imageButton = (ImageButton) findViewById(R.id.minusButton);
        imageButton.setOnClickListener(clickListener);
    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s;
            if(v.getId() == R.id.plusButton) {
                score++;
               // String s;
                if (score % 10 == 0 || score % 10 == 1 || score % 10 == 5 ||
                        score % 10 == 6 || score % 10 == 7 || score % 10 == 8
                        || score % 10 == 9) {
                    s = "Кликов: " + score + " раз";
                    mainBtn.setOnClickListener(clickListener);
                    mainText.setText(s.toCharArray(),0, s.length());
                } else if (score == 12 || score == 13 || score == 14 || score == 15
                        || score == 16 || score == 17 || score == 18 || score == 19) {
                    s = "Кликов: " + score + " раз";
                    mainBtn.setOnClickListener(clickListener);
                    mainText.setText(s.toCharArray(),0, s.length());
                } else {
                    s = "Кликов: " + score + " раза";
                    mainBtn.setOnClickListener(clickListener);
                    mainText.setText(s.toCharArray(),0, s.length());
                }

                mainBtn.setOnClickListener(clickListener);
                mainText.setText(s.toCharArray(),0, s.length());
            }

             if ((v.getId() == R.id.minusButton))
            {
                score --;
                if (score % 10 == 0  || score % 10 == -1 || score % 10 == -5 ||
                        score % 10 == -6 || score % 10 == -7  || score % 10 == -8
                        || score % 10 == -9  )
                {
                    s = "Кликов: " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                    imageButton.setOnClickListener(clickListener);
                }
                else if ( score == -12 || score == -13  || score ==-14 || score ==-15
                        || score == -16 || score == -17 || score == -18 || score ==-19)
                {
                    s = "Кликов: " + score + " раз";

                    mainText.setText(s.toCharArray(),0, s.length());
                    imageButton.setOnClickListener(clickListener);
                }
                else {
                    s = "Кликов: " + score + " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                    imageButton.setOnClickListener(clickListener);

                }
                mainText.setText(s.toCharArray(),0, s.length());
                imageButton.setOnClickListener(clickListener);
            }






        }
    };
}
