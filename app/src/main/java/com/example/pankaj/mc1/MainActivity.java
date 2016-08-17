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
    int ans;
    String msg = "Android : ";
    private ProgressDialog progress;
    private Button b1,b2,b3;
    Bundle b;
    int k;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(final Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.textView);
        txtView.setTextSize(20);
        Random r = new Random();
        k = r.nextInt(1000 - 1) + 1;

        String s = k + "   is a prime number ?";
        txtView.setText(s);
        progress = new ProgressDialog(this);
        ans=p(k);


        b1 = (Button) findViewById(R.id.yes);
        b2 = (Button) findViewById(R.id.no);
        b3 = (Button) findViewById(R.id.next);
        b1.setOnClickListener(onClickListener);
        b2.setOnClickListener(onClickListener);
        b3.setOnClickListener(onClickListener);
    }
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.yes:
                        if(ans==1)
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
                        k = r.nextInt(1000 - 1) + 1;

                        String s = k + "   is a prime number ?";
                        txtView.setText(s);
                        ans=p(k);


                        break;
                    case R.id.no:
                        if(ans==0) {

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
                        k = r.nextInt(1000 - 1) + 1;

                         s = k + "   is a prime number ?";
                        txtView.setText(s);
                        ans=p(k);


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
                        k = r.nextInt(1000 - 1) + 1;

                         s = k + "   is a prime number ?";
                        txtView.setText(s);
                        ans=p(k);

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
