package com.example.spotifymatchmaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SongS extends AppCompatActivity  {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_choose_genre);

        final Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newintent = new Intent(SongS.this, Rock.class);
                startActivity(newintent);
            }
        });
        final Button button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newintent = new Intent(SongS.this, Kpop.class);
                startActivity(newintent);
            }
        });
        final Button button3 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newintent = new Intent(SongS.this, Pop.class);
                startActivity(newintent);
            }
        });
        final Button button4 = (Button) findViewById(R.id.button5);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newintent = new Intent(SongS.this, Rnb.class);
                startActivity(newintent);
            }
        });
        final Button button5 = (Button) findViewById(R.id.button6);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newintent = new Intent(SongS.this, Rap.class);
                startActivity(newintent);
            }
        });



    }
}
