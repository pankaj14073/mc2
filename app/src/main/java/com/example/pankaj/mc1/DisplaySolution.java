package com.example.pankaj.mc1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplaySolution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_solution);
        setTitle("PRIMO SOLUTION");

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.NUMBER_MESSAGE);
        TextView nView = (TextView) findViewById(R.id.numberView);

        Intent result_intent=new Intent();
        result_intent.putExtra("TakenCheat","1");


        setResult(1, result_intent);

        nView.setText(message);

        String answer = intent.getStringExtra(MainActivity.SOLUTION_MESSAGE);
        if(answer.equals("1"))
            answer="Number is PRIME";
        else
            answer="Number is NOT PRIME";

        TextView txtView = (TextView) findViewById(R.id.answerView);
        txtView.setText(answer);
       // finish();


    }
}
