package com.example.souravi.signgenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Family extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView iv;
    TextView  ed;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Spinner element
        spinner = (Spinner) findViewById(R.id.spinner2);

        iv = (ImageView) findViewById(R.id.iv2);
        ed= (TextView) findViewById(R.id.tv7);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("SELECT.....");
        categories.add("Mom");
        categories.add("Dad");
        categories.add("Boy");
        categories.add("Girl");
        categories.add("Child");
        categories.add("Brother");
        categories.add("Sister");
        categories.add("Grandpa");
        categories.add("Grandma");
        categories.add("Aunt");
        categories.add("Uncle");
        categories.add("Baby");
        categories.add("Single");
        categories.add("Marriage");
        categories.add("Divorced");


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
                iv.setImageResource(R.drawable.mom);
                ed.setText("Note: there are several variations of the sign \"MOM.\" An interesting method I've seen is to place the tip of the thumb of your right \"A\" hand on your chin then open the \"A\" hand into a \"five\" hand.  ");

                break;
            case 2:
                iv.setImageResource(R.drawable.dad);
                ed.setText("Note:\n" +
                        "For the sign DAD you can use a slight \"tapping\" motion to touch the thumb to the forehead, move the hand out an inch, then touch the thumb to the forehead again.  You don't have to \"tap\" it.  You can just touch your thumb to the forehead for a moment. You don't even need to make contact with the forehead as long as you get it relatively close. ");
                break;
            case 3:
                iv.setImageResource(R.drawable.boy);
                ed.setText("To do the sign for \"boy\" grab an imaginary baseball cap on your forehead.  This sign also can mean MALE  and is one of the versions of MAN.");
               break;
            case 4:
                iv.setImageResource(R.drawable.girl);
                ed.setText("The sign for \"Girl\" is made by forming your hand into an \"A\"-hand and then trace along your jawbone with the tip of your thumb - starting near your ear and moving to near your chin.");
                break;
            case 5:
                iv.setImageResource(R.drawable.child);
                ed.setText("The sign for child is done by doing two pats on the top of an imaginary child's head.\n" +
                        "You can do it with \"one\" pat, but could be mis-interpreted as \"short.\"\n" +
                        "\n" +
                        "The sign for \"children\" is to pat the heads of two different imaginary children one time each. ");

                break;
            case 6:
                iv.setImageResource(R.drawable.brother);
                ed.setText("The sign for \"brother\" uses a modified \"L\"-hand that turns into a \"1\"-hand as it moves from the forehead down to make contact with the base hand (which is in a 1-handshape). ");
                break;
            case 7:
                iv.setImageResource(R.drawable.sister);
                ed.setText("The sign for \"sister\" uses a modified \"L\"-hand that turns into a \"1\"-hand as it moves from the jaw down to make contact with the base hand (which is in a 1-handshape). ");
                break;
            case 8:
                iv.setImageResource(R.drawable.grandpa);
                ed.setText("The sign for \"grandfather\" is made by touching your forehead with the thumb of your dominant hand, (the same as when signing \"father\").  The hand should be open.  Now, move your hand forward in two small arches.\n" +
                        "Note: Many people just move it forward without the arches.");
                break;
            case 9:
                iv.setImageResource(R.drawable.grandma);
                ed.setText("The sign for \"grandma\" or \"grandmother\" is made by touching your chin with the thumb of your right hand, as when signing \"mother.\"  The right hand should be open.  Now, move your hand forward in two small arches.");
                break;
            case 10:
                iv.setImageResource(R.drawable.aunt);
                ed.setText("The sign for \"aunt\" is made by first shaping your hand to form the letter \"A.\" Hold your hand close to your cheek.  Twist your hand a couple of times.");
                break;
            case 11:
                iv.setImageResource(R.drawable.uncle);
                ed.setText("The sign for \"uncle\" is made by first shaping your hand to form the letter \"U.\"  Hold your hand close to your right temple. Twist your hand a couple of times.");
                break;
            case 12:
                iv.setImageResource(R.drawable.baby);
                ed.setText("The sign for \"baby\"  is made by placing both arms together as if holding an infant.  Then gently rock your arms back and forth.  Tip: think of holding a baby in your arms.");
                break;
            case 13:
                iv.setImageResource(R.drawable.single);
                ed.setText("Note: This version of \"SINGLE\" also means: \"something / someone / alone / only.\"  It is a very flexible sign and you must rely on context to understand the meaning.\n" +
                        "This sign is made by holding the right arm in front of you, palm up. \n" +
                        "Your right index finger makes circular motions about the size of a quarter. The movement is in your shoulder and elbow, not in your wrist. ");
                break;
            case 14:
                iv.setImageResource(R.drawable.marriage);
                ed.setText("The sign for \"marriage\" is made by clasping both hands comfortably together. \n" +
                        "For right-handed people the right hand should be on top of the left hand.");
                break;
            case 15:
                iv.setImageResource(R.drawable.divorce);
                ed.setText("The sign for \"divorce\" is made by first forming the letter \"d\" with both hands.  Hold both hands together with the palms facing each other. With a twisting motion, move both hands outward and sideways so both palms face forward.Memory Aid: Think of two objects or two people that were once together as now being apart.");
                break;




        }

    }
    public void onNothingSelected(AdapterView<?> arg0) {


    }

}
