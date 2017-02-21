package com.example.gijs.getrikt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AddPlayer extends AppCompatActivity {
    
    String addPlayerString;
    SharedPreferences sharedPreferences;
    EditText textFieldNewPlayer;
    Button tfbutton;
    TextView textview_1;
    String textview_1String;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addPlayerString = "DefaultName";
        tfbutton = (Button) findViewById(R.id.button_1);
        textview_1 = (TextView) findViewById(R.id.id.textView_1);
        textview_1String = textview_1.toString();



        textFieldNewPlayer = (EditText)findViewById(R.id.NewPlayerTextField);

        tfbutton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        addPlayerString = textFieldNewPlayer.getText().toString();
                        addPlayer(addPlayerString);
                        textview_1.setText(textFieldNewPlayer.getText().toString() + " is het laatst toegevoegd");
                    }
                });

        showPlayers();



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "HAHAHA sukkel, alleen homo's drukken op roze knopjes", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    void addPlayer(String Naam){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Speler_1",Naam);
    }

    private void showPlayers(){

    }

}
