package com.example.pankaj.mc1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int answer;
    String msg = "Android : ";
    private ProgressDialog progress;
    private Button yesButton,noButton,nextButton;;
    int currentValue;
    static final String  key="key";

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {

        Random r = new Random();

        super.onCreate(savedInstanceState);
      if (savedInstanceState != null) {
            // Restore value of members from saved state
          currentValue = savedInstanceState.getInt(key);

        } else {
          currentValue = r.nextInt(1000 - 1) + 1;
            // Probably initialize members with default values for a new instance
        }

        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.textView);
        txtView.setTextSize(20);

        //k = r.nextInt(1000 - 1) + 1;
        String s = currentValue + "   is a prime number ?";
        txtView.setText(s);
        progress = new ProgressDialog(this);
        answer=p(currentValue);


        yesButton = (Button) findViewById(R.id.yes);
        noButton = (Button) findViewById(R.id.no);
        nextButton = (Button) findViewById(R.id.next);
        yesButton.setOnClickListener(onClickListener);
        noButton.setOnClickListener(onClickListener);
        nextButton.setOnClickListener(onClickListener);
    }
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.yes:
                        if(answer==1)
                        {

                            ImageView img = (ImageView) findViewById(R.id.imageView);
                         //   img.setImageResource(R.drawable.abc);
                            Toast.makeText(getApplicationContext(), "congratulations", Toast.LENGTH_SHORT).show();

                        }
                        else
                        {

                            ImageView img= (ImageView) findViewById(R.id.imageView);
                           // img.setImageResource(R.drawable.abc);
                            Toast.makeText(getApplicationContext(), "idiot its a wrong answer", Toast.LENGTH_SHORT).show();

                        }
                        TextView txtView = (TextView) findViewById(R.id.textView);
                        txtView.setTextSize(20);
                        Random r = new Random();
                        currentValue= r.nextInt(1000 - 1) + 1;

                        String s = currentValue + "   is a prime number ?";
                        txtView.setText(s);
                        answer=p(currentValue);


                        break;
                    case R.id.no:
                        if(answer==0) {

                            ImageView img = (ImageView) findViewById(R.id.imageView);
                          //  img.setImageResource(R.drawable.abc);
                            Toast.makeText(getApplicationContext(), "congratulations", Toast.LENGTH_LONG).show();

                        }
                        else
                        {

                            ImageView img= (ImageView) findViewById(R.id.imageView);
                          //  img.setImageResource(R.drawable.abc);
                            Toast.makeText(getApplicationContext(), "idiot its a wrong answer", Toast.LENGTH_LONG).show();

                        }
                         txtView = (TextView) findViewById(R.id.textView);
                        txtView.setTextSize(20);
                         r = new Random();
                        currentValue = r.nextInt(1000 - 1) + 1;

                         s = currentValue + "   is a prime number ?";
                        txtView.setText(s);
                        answer=p(currentValue);


                        //DO something
                        break;
                    case R.id.next:
                      /*  Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                        */
                         txtView = (TextView) findViewById(R.id.textView);
                        txtView.setTextSize(20);
                         r = new Random();
                        currentValue = r.nextInt(1000 - 1) + 1;

                         s = currentValue + "   is a prime number ?";
                        txtView.setText(s);
                        answer=p(currentValue);

                        break;

                }

            }
        };


    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(key,currentValue);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();

        Log.d(msg, "The onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

    public int p(int number){ for(int i=2; i<=number/2; i++){ if(number % i == 0){ return 0; } } return 1; }



}
