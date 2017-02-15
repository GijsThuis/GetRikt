package com.example.gijs.getrikt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.LinkedList;

public class PickPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_players);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Intent intent = getIntent();
        DefaultSpeler Gijs = new DefaultSpeler("Gijs");
        LinkedList<DefaultSpeler> lijstSpelers = new LinkedList();


        klaarMetKiezen(Gijs);
    }

    //open play game met een meegegeven speler
    private void klaarMetKiezen(DefaultSpeler ds){
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("spelernaam",ds);
        startActivity(intent);
    }

    //open play game met een lijst van meegegeven spelers
    private void klaarMetKiezen(LinkedList<DefaultSpeler> lijst){
        Intent intent = new Intent(this, PlayGame.class);
        intent.putExtra("lijst",lijst);
        startActivity(intent);
    }
}
