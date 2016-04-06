package com.example.souravi.signgenerator;

import android.app.Activity;
import java.util.*;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//import android.R.*;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


import java.util.Locale;

public class MainActivity extends Activity {
    String value;
    EditText text1;
    ImageView iv1;
    TextView title;
    private final int REQ_CODE_SPEECH_INPUT=100;
    private GoogleApiClient client;
    //private Integer images[] = {R.drawable.a, R.drawable.b};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=(TextView)findViewById(R.id.textView);
        text1 = (EditText) findViewById(R.id.text); //referencing the text
        text1.setTextColor(Color.BLUE);
        title.setTextColor(Color.WHITE);
        final Button fetch = (Button) findViewById(R.id.convert);  //referencing the button
        fetch.setBackgroundColor(Color.TRANSPARENT);
        iv1 = (ImageView) findViewById(R.id.imageView); //referencing the imageview
        final Button speak = (Button) findViewById(R.id.speak);
        speak.setBackgroundColor(Color.TRANSPARENT);
        final Button learn =(Button)findViewById(R.id.learn);
        learn.setBackgroundColor(Color.TRANSPARENT);
        //value = text1.getText().toString();
        //int[] images = {R.drawable.a, R.drawable.b};

            fetch.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    value = text1.getText().toString();





                                     if(value.compareToIgnoreCase("hello")==0) {
                                          iv1.setImageResource(R.drawable.hello);
                                      }

                                      else if(value.compareToIgnoreCase("mom")==0 || value.compareToIgnoreCase("mother")==0) {
                                          iv1.setImageResource(R.drawable.mom);
                                      }

                                     else if(value.compareToIgnoreCase("morning")==0) {
                                         iv1.setImageResource(R.drawable.morning);
                                     }

                                     else if(value.compareToIgnoreCase("child")==0) {
                                         iv1.setImageResource(R.drawable.child);

                                     }
                                     else if(value.compareToIgnoreCase("baby")==0) {
                                         iv1.setImageResource(R.drawable.baby);
                                     }
                                     else if(value.compareToIgnoreCase("girl")==0) {
                                         iv1.setImageResource(R.drawable.girl);
                                     }
                                     else if(value.compareToIgnoreCase("boy")==0) {
                                         iv1.setImageResource(R.drawable.boy);
                                     }

                                     else if(value.compareToIgnoreCase("brother")==0) {
                                         iv1.setImageResource(R.drawable.brother);
                                     }
                                     else if(value.compareToIgnoreCase("aunt")==0) {
                                         iv1.setImageResource(R.drawable.aunt);
                                     }
                                     else if(value.compareToIgnoreCase("uncle")==0) {
                                         iv1.setImageResource(R.drawable.uncle);
                                     }
                                     else if(value.compareToIgnoreCase("marriage")==0) {
                                         iv1.setImageResource(R.drawable.marriage);
                                     }
                                     else if(value.compareToIgnoreCase("morning")==0) {
                                         iv1.setImageResource(R.drawable.morning);
                                     }
                                     else if(value.compareToIgnoreCase("single")==0) {
                                         iv1.setImageResource(R.drawable.single);
                                     }
                                     else if(value.compareToIgnoreCase("dad")==0 || value.compareToIgnoreCase("father")==0) {
                                         iv1.setImageResource(R.drawable.dad);
                                     }



                    else Toast.makeText(getApplicationContext(), "LEARN MORE BY PRESSING LEARN..", Toast.LENGTH_LONG).show();









                }
            });


        /*final String one = String.valueOf(R.drawable.a);
        Toast.makeText(getApplicationContext(), one, Toast.LENGTH_SHORT).show();
        final String two = String.valueOf(R.drawable.b);
        Toast.makeText(getApplicationContext(), two, Toast.LENGTH_SHORT).show();
        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
                if (value.equals(one)) {
                    Toast.makeText(getApplicationContext(), "Hello a", Toast.LENGTH_SHORT).show();
                    iv1.setImageResource(R.drawable.a);
                } else if (value.equals(two)) {
                    Toast.makeText(getApplicationContext(), "Hello b", Toast.LENGTH_SHORT).show();
                    iv1.setImageResource(R.drawable.b);
                }
            }
        });*/

                speak.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        promptSpeechInput();
                    }
                });
                learn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                       startNewActivity();
                    }
                });

    }

    private void startNewActivity()
    {
        Intent myIntent = new Intent(MainActivity.this,Category.class);
        MainActivity.this.startActivity(myIntent);
    }

    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(), getString(R.string.speech_not_suported), Toast.LENGTH_SHORT).show();
        }
    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        switch(requestCode)
        {
            case REQ_CODE_SPEECH_INPUT:
            {
                if(resultCode==RESULT_OK && null!=data)
                {
                    ArrayList<String> result=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text1.setText(result.get(0));

                }
                break;
            }
        }
    }
}