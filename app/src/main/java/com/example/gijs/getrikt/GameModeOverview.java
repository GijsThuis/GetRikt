package com.example.gijs.getrikt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;


public class GameModeOverview extends AppCompatActivity {

    RondeTypeDoos rondeTypeDoos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_overview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rondeTypeDoos = new RondeTypeDoos();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        LinkedList<RondeType> doos = rondeTypeDoos.getDoos();
        ListView myListView = (ListView) findViewById(R.id.listview_1);

        String [] array = {"","REGULIERE SPELLEN", doos.get(0).toString() , doos.get(1).toString(), doos.get(2).toString(), "PASSPELLEN",doos.get(3).toString()};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                System.out.println(textView.getText().toString());
            }
        });




        /*

        //Poging 1
        LinearLayout linearLayout = new LinearLayout(this);


        final int N = 10; // total number of textviews to add

        final TextView[] myTextViews = new TextView[N]; // create an empty array;


        for (int i = 0; i < N; i++) {
            // create a new textview
            final TextView rowTextView = new TextView(this);

            // set some properties of rowTextView or something
            String text = doos.get(i).getSpelnaam() + '\t' + doos.get(i).getWinstPerVerliezer();
            rowTextView.setText(text);

            // add the textview to the linearlayout
            linearLayout.addView(rowTextView);

            // save a reference to the textview for later
            myTextViews[i] = rowTextView;
        }
        */


    }

}
