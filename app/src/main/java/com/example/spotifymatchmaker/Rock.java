package com.example.spotifymatchmaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rock extends AppCompatActivity {


    TextView artistView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rock);

        TextView artistView = (TextView)findViewById(R.id.pop1);

        int num = (int) (Math.random() * 5);


        if (num == 0) {
            artistView.setText("SALR");
        } else if (num == 1) {
            artistView.setText("BWNO");
        } else if (num == 2) {
            artistView.setText("Heart of Gold");
        } else if (num == 3) {
            artistView.setText("Jet Black Alley Cat");
        } else {
            artistView.setText("blessthefall");
        }


    }
}
