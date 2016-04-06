package com.example.souravi.signgenerator;

import android.os.Bundle;
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

import java.util.ArrayList;
import java.util.List;

public class Place extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ImageView iv;
    TextView ed;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner = (Spinner) findViewById(R.id.spinner3);
        iv = (ImageView) findViewById(R.id.iv2);
        ed = (TextView) findViewById(R.id.tv12);

        List<String> categories = new ArrayList<String>();
        categories.add("SELECT.....");
        categories.add("home");
        categories.add("work");
        categories.add("school");
        categories.add("college");
        categories.add("store");
        categories.add("come");
        categories.add("go");
        categories.add("in");
        categories.add("out");
        categories.add("car");
        categories.add("with");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(position)
        {
            case 1:
                iv.setImageResource(R.drawable.home);
                ed.setText("The sign for \"home\" is made by bringing your fingers and thumb together and touching your cheek at the side of your mouth. Then move your hand an inch or two toward your ear and touch your cheek again.Note: The sign isn't done on the mouth. It is done on the cheek. The above is just a way to remember the sign.");
                break;

            case 2:
                iv.setImageResource(R.drawable.work);
                ed.setText("The sign for \"work\" is made by shaping both hands into \"fist shapes\" (the letter \"s.\")  With your palms facing downward, use your dominant fist to tap the wrist or the side of your non-dominant fist a few times.");
                break;

            case 3:
                iv.setImageResource(R.drawable.school);
                ed.setText("The sign for \"school\" uses loose flat hands. You lower your dominant hand onto your base hand twice as if clapping.Other meanings:  \"Academic\" Handshape:  loose \"flat\" hands. (Or even \"5\" hands, but the fingers tend to be together. Location: In the neutral signing space in front of the body  \"Orientation: Right hand faces down.  Left hand faces up.");
                break;

            case 4:
                iv.setImageResource(R.drawable.college);
                ed.setText("Both hands are in loose \"flat\" handshapes.  They are not \"5\" handshapes, but then again they are not \"B\" handshapes either.  The dominant hand starts from a couple inches above the base hand and does a circling movement as it slaps downward and comes back up a few inches.The sign for \"college\" means both \"college\" as well as \"university.\" However If you initialize this sign with a \"U\" handshape on the dominant hand, it means specifically \"university.\"");
                break;

            case 5:
                iv.setImageResource(R.drawable.store);
                ed.setText("The sign for \"store\" is made by bending both wrists and pointing both hands down.  Pivot both of your hands forward (away from your body) twice.  In general the double movement makes this sign a noun.   If you use a single motion, this sign means \"sell.\"The fingertips swing forward and back a couple times. The thumbs are touching the fingers as if you were holding a piece of paper.");
                break;

            case 6:
                iv.setImageResource(R.drawable.come);
                ed.setText("It requires a single quick movement.The fingers are pointed away from you");
                break;
            case 7:
                iv.setImageResource(R.drawable.go);
                ed.setText("It requires a single quick movement.The fingers are pointed towards you");
                break;

            case 8:
                iv.setImageResource(R.drawable.in);
                ed.setText("To do the basic sign for \"in,\" close the fingers of your dominant hand hand, form your non-dominant hand into a \"C,\" and place the fingers of your dominant hand into the \"C\" hand.");
                break;
            case 9:

                iv.setImageResource(R.drawable.out);
                break;
            case 10:
                iv.setImageResource(R.drawable.car);
                ed.setText("You can sign \"car\" (or drive) by using both hands in \"S\" handshapes and moving them as if controlling a steering wheel.  To differentiate between \"car\" and \"drive,\" sign \"car\" smaller and \"drive\" larger. Drive can also be modified by using a \"forward and back\" movement, and various facial expressions.");
                break;

            case 11:
                iv.setImageResource(R.drawable.with);
                ed.setText("The sign for \"WITH\" is made by forming the letter \"a\" with both hands.  Place both your hands together, palms facing. Note:If you hold the \"A\" hands together and then make a sweeping horizontal circle it shows \"solidarity.\" as in the group is working together");
                break;




        }



    }
    public void onNothingSelected(AdapterView<?> arg0) {


    }



}
