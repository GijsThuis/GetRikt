package com.example.gijs.getrikt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  //  String addPlayerString;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // addPlayerString = "DefaultName";


        //ALL BUTTONS IN MAINACTIVITY
        final Button buttonnewgame = (Button) findViewById(R.id.NewGameButton);
        buttonnewgame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onClicknewGame();
            }
        });

        final Button buttonrankings = (Button) findViewById(R.id.RankingsButton);
        buttonrankings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onClickRankings();
            }
        });

        final Button buttonaddplayer = (Button) findViewById(R.id.AddPlayerButton);
        buttonaddplayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onClickAddPlayers();
            }
        });

        final Button buttongamemodeoverview = (Button) findViewById(R.id.GameModeOverviewButton);
        buttongamemodeoverview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onClickGameModeOverview();
            }
        });

    }
/*
    @Override
    protected void onPause(){
        super.onPause();
        sharedPreferences.edit().putString("player_1",addPlayerString).apply();
    }
    */


    public void onClicknewGame(){
        Intent intent = new Intent(this, PickPlayers.class);
        startActivity(intent);
    }

    public void onClickRankings(){
        Intent intent = new Intent(this, Rankings.class);
        startActivity(intent);
    }

    public void onClickAddPlayers(){
        Intent intent = new Intent(this, AddPlayer.class);
        startActivity(intent);
    }

    public void onClickGameModeOverview(){
        Intent intent = new Intent(this, GameModeOverview.class);
        startActivity(intent);
    }


}
