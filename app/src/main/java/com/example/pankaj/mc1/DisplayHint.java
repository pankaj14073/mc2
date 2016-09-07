package com.example.pankaj.mc1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayHint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_hint);
        setTitle("PRIMO HINT");

        Intent intent = getIntent();
        Intent result_intent=new Intent();
        result_intent.putExtra("TakenHint","1");

        setResult( 1, result_intent);
          String message = intent.getStringExtra(MainActivity.NUMBER_MESSAGE);
          TextView nView = (TextView) findViewById(R.id.numberView);
          nView.setText(message);
        TextView txtView = (TextView) findViewById(R.id.textView);



    }
}
