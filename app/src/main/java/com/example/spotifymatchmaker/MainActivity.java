package com.example.spotifymatchmaker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    private TextView userView;
    private TextView songView;
    private Button addBtn;
    private Song song;

    private SongService songService;
    private ArrayList<Song> recentlyPlayedTracks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songService = new SongService(getApplicationContext());
        //userView = (TextView) findViewById(R.id.user);
        //songView = (TextView) findViewById(R.id.song);
        addBtn = (Button) findViewById(R.id.add);

        SharedPreferences sharedPreferences = this.getSharedPreferences("SPOTIFY", 0);
        //userView.setText(sharedPreferences.getString("userid", "No User"));

        getTracks();

        final Button button = (Button) findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newintent = new Intent(MainActivity.this, Instr.class);
                startActivity(newintent);
            }
        });


    }




    private void getTracks() {
        songService.getRecentlyPlayedTracks(() -> {
            recentlyPlayedTracks = songService.getSongs();
            updateSong();
        });
    }

    private void updateSong() {
        if (recentlyPlayedTracks.size() > 0) {
            //songView.setText(recentlyPlayedTracks.get(0).getName());
            song = recentlyPlayedTracks.get(0);
        }
    }

}