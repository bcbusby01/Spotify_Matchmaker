package com.example.spotifymatchmaker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Kpop extends AppCompatActivity {


    TextView artistView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kpop);

        TextView artistView = (TextView)findViewById(R.id.pop1);

        int num = (int) (Math.random() * 5);


        if (num == 0) {
            artistView.setText("Dvwn");
        } else if (num == 1) {
            artistView.setText("BIBI");
        } else if (num == 2) {
            artistView.setText("Ovan");
        } else if (num == 3) {
            artistView.setText("Holland");
        } else {
            artistView.setText("one");
        }


    }
}
