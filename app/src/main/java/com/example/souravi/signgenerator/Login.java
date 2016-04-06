package com.example.souravi.signgenerator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
MainDBAdaptor mainDBAdaptor;
    String person;
    String person_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);
       //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       //setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        final EditText username = (EditText) findViewById(R.id.user);
        final EditText password = (EditText) findViewById(R.id.pass);
        Button log = (Button) findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();

                mainDBAdaptor = new MainDBAdaptor(getApplicationContext());
                String mydata = mainDBAdaptor.selectfetch(uname, pass);
                try {
                    String[] data = mydata.split(";");
                    person = data[0];
                    person_pass = data[1];
                }catch (ArrayIndexOutOfBoundsException e){
                    e.printStackTrace();
                }

                if (uname.equals(person) && pass.equals(person_pass)){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Wrong username or password!", Toast.LENGTH_LONG).show();
            }
        });

        Button registration = (Button) findViewById(R.id.register);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Register.class);
                startActivity(intent1);
            }
        });
    }

}
