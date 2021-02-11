package com.example.spinnerwithonitemclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //sob kichur length soman howa joruri
     Spinner spinner;
     String[] countryNames;
     String[] population;
     int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan, R.drawable.bahrain, R.drawable.bangladesh, R.drawable.bhutan,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.nepal, R.drawable.pakistan, R.drawable.srilanka
    };

     private boolean firstSelection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_names);
        population = getResources().getStringArray(R.array.population);

        spinner = findViewById(R.id.spinnerId);

        SpinnerCustomAdapter spinnerCustomAdapter = new SpinnerCustomAdapter(this, flags, countryNames, population);

        spinner.setAdapter(spinnerCustomAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(firstSelection == true){
                    firstSelection = false;
                } else {
                    Toast.makeText(getApplicationContext(), countryNames[position] + " is selected", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}