package com.example.spotifymatchmaker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rnb extends AppCompatActivity {


    TextView artistView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rnb);

        TextView artistView = (TextView)findViewById(R.id.pop1);

        int num = (int) (Math.random() * 4);


        if (num == 0) {
            artistView.setText("The Curfew");
        } else if (num == 1) {
            artistView.setText("flor");
        } else if (num == 2) {
            artistView.setText("Hutton Cordova");
        } else  {
            artistView.setText("Luke Chiang");
        }


    }
}