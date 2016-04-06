package com.example.souravi.signgenerator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
MainDBAdaptor mainDBAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        final EditText username= (EditText) findViewById(R.id.uname);
        final EditText pass= (EditText) findViewById(R.id.password);
        final EditText confirmpassword= (EditText) findViewById(R.id.con_pass);

        Button registration = (Button) findViewById(R.id.register);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String confirm = confirmpassword.getText().toString();
                String user = username.getText().toString();
                String password = pass.getText().toString();
                if(confirm.equals(password)) {
                    mainDBAdaptor = new MainDBAdaptor(getApplicationContext());
                    long count = mainDBAdaptor.insertData(user, password);

                    if (count > 0) {
                        Toast.makeText(getApplicationContext(), "Successfully Registered", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid credentials, Please review", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Your passwords do not match", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}
