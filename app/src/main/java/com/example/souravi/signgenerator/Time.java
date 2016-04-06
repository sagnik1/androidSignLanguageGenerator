package com.example.souravi.signgenerator;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.util.Log;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;


public class Time extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    ImageView iv;
    TextView ed;
    Spinner spinner;
    int[] imageArray = {R.drawable.month1, R.drawable.month2, R.drawable.month3};
    int[] todayArray = {R.drawable.today1, R.drawable.today2};


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        spinner = (Spinner) findViewById(R.id.spinner4);
        iv = (ImageView) findViewById(R.id.iv2);
        ed = (TextView) findViewById(R.id.tv12);

        List<String> categories = new ArrayList<String>();
        categories.add("SELECT.....");
        categories.add("day");
        categories.add("night");
        categories.add("week");
        categories.add("month");
        categories.add("year");
        categories.add("will(future)");
        categories.add("before(in the past)");
        categories.add("today(now)");
        categories.add("finish");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);




    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 1:
                iv.setImageResource(R.drawable.day);
                ed.setText("The sign for \"day\" is made by holding your non-dominant arm (the left arm for most people) in front of you, palm down, pointing right.Your left hand can be in either a \"flat handshape\" or an \"index finger handshape.\"  Your your dominant hand (the right hand for most people) can be either an \"index finger\" or a \"flat hand.\" Rest your right elbow on the back of the left hand. Your right arm should point up. Move your right arm across your body, the hand tracing an arc while keeping the right elbow on or very near the back of the left hand.");

                break;

            case 2:
                iv.setImageResource(R.drawable.night);
                ed.setText("The sign for \"night\" is made by holding your non-dominant arm horizontally, palm down, pointing to the side. (If you are right handed that means your left arm would be pointing toward the right.) Put your dominant hand's wrist on the back of your non-dominant hand, fingertips pointing down. ");
                break;

            case 3:
                iv.setImageResource(R.drawable.week);
                ed.setText("The sign for \"week\" has a couple of variations. The basic sign for \"week\" is made by forming your dominant hand into an index-finger handshape and moving your hand forward over the palm of your non-dominant hand.");
                break;

            case 4:
                ed.setText("The sign for \"month\" is made by pointing upward with the index finger of your non-dominant hand. If you are right handed, the palm of the left hand should face right. The palm of the right hand should face back.  Trace the right index finger from the top to the bottom of the left index finger.  ");

                final Handler handler = new Handler();
                Runnable r1 = new Runnable()
                {
                    int i=0;
                    public void run() {
                        try {
                            iv.setImageResource(imageArray[i]);
                            i++;
                            if (i > imageArray.length - 1) {
                                iv.removeCallbacks(this);
                            }
                            handler.postDelayed(this, 2000);  //for interval...
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                    }



                };
                handler.postDelayed(r1,100);


                break;

            case 5:
                iv.setImageResource(R.drawable.year);
                ed.setText("The sign for \"year\" is made by forming both hands into the letter \"S.\"  If you are right handed, rotate your right hand completely around the left. The right hand should come to rest on top of the left.  ");
                break;

            case 6:
                iv.setImageResource(R.drawable.future);
                ed.setText("The sign for \"future\" is made by slicing a \"flat hand\" forward through the air.  The farther you move your hand, the further into the the future you are referring.  This sign can also mean such things as \"WILL\" as in, \"Will you go to college?\" (YOU FUTURE COLLEGE YOU?).  You can also use a double arching movement to mean \"someday\" or \"the distant future.\"  If you do a single large strong movement it can mean \"a long time from now.\"\n");
                break;

            case 7:
                iv.setImageResource(R.drawable.past);
                ed.setText("The sign for \"past\" is made by moving your dominant hand over your dominant shoulder.  Your palm should face your body. The more emphasis you give the motion and/or the larger movement you use indicates further into the past");
                break;

            case 8:
                ed.setText("The sign for \"now\" is made by placing both of your hands in front of you in \"Y\" handshapes.  Each hand should be pointing upward.  Sharply drop both of your hands a short distance. ");

                final Handler handler1 = new Handler();
                Runnable r = new Runnable()
                {
                    int i=0;
                    public void run() {
                        try {
                            iv.setImageResource(todayArray[i]);
                            i++;
                            if (i > todayArray.length - 1) {
                                iv.removeCallbacks(this);
                            }
                            handler1.postDelayed(this, 2000);  //for interval...
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                    }



                };
                handler1.postDelayed(r,100);



                break;

            case 9:
                iv.setImageResource(R.drawable.finish);
                ed.setText("The sign for \"finish\" is made by placing both of your open hands in front of you.  Each hand should face you, with your fingers pointing upward.  Twist both hands quickly a couple times ending with the palms pointing (somewhat) forward.  You can also do this sign with just a single twist which makes it seem more \"final.\"");
                break;



        }


}

    public void onNothingSelected(AdapterView<?> arg0) {


    }




}


