package com.example.bmr;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick (View view) { // main functionality

        // import information

        EditText age_t = findViewById(R.id.editTextNumber); // age field
        EditText weight_t = findViewById(R.id.editTextNumber2); // weight
        EditText height_t = findViewById(R.id.editTextNumber3); // height
        Switch gender_t = findViewById(R.id.switch2); // gender

        if (age_t.getText().toString().equals("") || weight_t.getText().toString().equals("") || height_t.getText().toString().equals("")) { // if one field is emppty
            // do nothing
        } else { // operate normally
            int age = Integer.parseInt(age_t.getText().toString());
            int weight = Integer.parseInt(weight_t.getText().toString());
            int height = Integer.parseInt(height_t.getText().toString());

            double calories; // final result

            // calculate calories

            if (gender_t.isChecked()) {
                calories = 10*(weight)+6.25*(height)-5*age-161; // women
            } else {
                calories = 10*(weight)+6.25*(height)-5*age+5; // men
            }

            String cals = Double.toString(calories);

            // print results

            TextView results = findViewById(R.id.text_2);
            results.setText(cals);
        }


    }


    public void power_off(View view) { // closes app
        System.exit(1);
    } // close app


}