package com.example.pankaj.mc1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayHint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_hint);
        setTitle("PRIMO HINT");
        Intent intent = getIntent();

          String message = intent.getStringExtra(MainActivity.NUMBER_MESSAGE);
          TextView nView = (TextView) findViewById(R.id.numberView);
          nView.setText(message);
        TextView txtView = (TextView) findViewById(R.id.textView);

    }
}
