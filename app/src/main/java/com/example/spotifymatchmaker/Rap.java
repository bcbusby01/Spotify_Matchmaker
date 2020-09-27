package com.example.spotifymatchmaker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rap extends AppCompatActivity {


    TextView artistView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rap);

        TextView artistView = (TextView)findViewById(R.id.pop1);

        int num = (int) (Math.random() * 5);


        if (num == 0) {
            artistView.setText("J.K The Reaper");
        } else if (num == 1) {
            artistView.setText("Barlito");
        } else if (num == 2) {
            artistView.setText("Quay Dash");
        } else if (num == 3) {
            artistView.setText("Le1f");
        } else {
            artistView.setText("Yung Divide");
        }


    }
}