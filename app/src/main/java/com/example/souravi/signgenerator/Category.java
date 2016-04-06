package com.example.souravi.signgenerator;


import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.content.Intent;

public class Category extends Activity implements OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_category);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("SELECT....");
        categories.add("Family");
        categories.add("Places");
        categories.add("Time");
        categories.add("Temperature");
        categories.add("Food");
        categories.add("Clothe");
        categories.add("Health");
        categories.add("Feelings");
        categories.add("Requests");
        categories.add("Amounts");
        categories.add("Colors");
        categories.add("Money");
        categories.add("Animals");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch(position){
            case 1:
                final Intent intent1;
                intent1 = new Intent(Category.this, Family.class);
                startActivity(intent1);
                break;
            case 2:
                final Intent intent2;
                intent2 = new Intent(Category.this, Place.class);
                startActivity(intent2);
                break;
            case 3:
                final Intent intent3;
                intent3 = new Intent(Category.this, Time.class);
                startActivity(intent3);
                break;
            case 4:
                final Intent intent4;
                intent4 = new Intent(Category.this, Temp.class);
                startActivity(intent4);
                break;
            case 5:
                final Intent intent5;
                intent5 = new Intent(Category.this, Food.class);
                startActivity(intent5);
                break;
            case 6:
                final Intent intent6;
                intent6 = new Intent(Category.this,Clothe.class);
                startActivity(intent6);
                break;
            case 7:
               final Intent intent7;
                intent7 = new Intent(Category.this, Health.class);
                startActivity(intent7);
                break;
            case 8:
                final Intent intent8;
                intent8 = new Intent(Category.this, Feel.class);
                startActivity(intent8);
                break;
            case 9:
                final Intent intent9;
                intent9 = new Intent(Category.this, Request.class);
                startActivity(intent9);
                break;
            case 10:
                final Intent intent10;
                intent10 = new Intent(Category.this, Amount.class);
                startActivity(intent10);
                break;
            case 11:
                final Intent intent11;
                intent11 = new Intent(Category.this, Color.class);
                startActivity(intent11);
                break;
            case 12:
                final Intent intent12;
                intent12 = new Intent(Category.this, Money.class);
                startActivity(intent12);
                break;
            case 13:
                final Intent intent13;
                intent13 = new Intent(Category.this, Animal.class);
                startActivity(intent13);
                break;

        }



    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}
