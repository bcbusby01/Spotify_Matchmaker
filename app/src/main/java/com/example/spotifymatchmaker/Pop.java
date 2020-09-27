package com.example.spotifymatchmaker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Pop extends AppCompatActivity {


    TextView artistView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop);

        TextView artistView = (TextView)findViewById(R.id.pop1);

        int num = (int) (Math.random() * 5);


        if (num == 0) {
            artistView.setText("remyz");
        } else if (num == 1) {
            artistView.setText("Closure");
        } else if (num == 2) {
            artistView.setText("Township");
        } else if (num == 3) {
            artistView.setText("Max Reichert");
        } else {
            artistView.setText("Panama Wedding");
        }


    }
}
