package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    Spinner source, destination;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        source = findViewById(R.id.source);
        destination = findViewById(R.id.destination);
        editText = findViewById(R.id.textEdit);

        String[] lengths1 = {"Inches", "Feet", "Yards", "Miles", "Centimetres", "Metres", "Kilometres"};

        ArrayAdapter arrayAdapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lengths1);
        source.setAdapter(arrayAdapter1);

        String[] lengths2 = {"Inches", "Feet", "Yards", "Miles", "Centimetres", "Metres", "Kilometres"};
        ArrayAdapter arrayAdapter2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lengths2);
        destination.setAdapter(arrayAdapter2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Double total;
                Double amount = Double.parseDouble(editText.getText().toString());

                if (source.getSelectedItem().toString() == "Inches" && destination.getSelectedItem().toString() == "Feet"){
                    total = amount / 12;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == destination.getSelectedItem().toString()) {
                    total = amount;
                }

                else if (destination.getSelectedItem().toString() == "Inches" && source.getSelectedItem().toString() == "Feet"){
                    total = amount * 12;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Inches" && destination.getSelectedItem().toString() == "Yards") {
                    total = amount / 36;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Inches" && source.getSelectedItem().toString() == "Yards") {
                    total = amount * 36;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Inches" && destination.getSelectedItem().toString() == "Miles") {
                    total = amount / 63360;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Inches" && source.getSelectedItem().toString() == "Miles") {
                    total = amount * 63360;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Inches" && destination.getSelectedItem().toString() == "Centimetres") {
                    total = amount * 2.54;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Inches" && source.getSelectedItem().toString() == "Centimetres") {
                    total = amount / 2.54;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Inches" && destination.getSelectedItem().toString() == "Metres") {
                    total = amount / 39.37;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Inches" && source.getSelectedItem().toString() == "Metres") {
                    total = amount * 39.37;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Inches" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 39370;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Inches" && source.getSelectedItem().toString() == "Kilometres") {
                    total = amount * 39370;
                    textView.setText(total.toString());
                }

                //From feet
                else if (source.getSelectedItem().toString() == "Feet" && destination.getSelectedItem().toString() == "Yards") {
                    total = amount / 3;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Feet" && source.getSelectedItem().toString() == "Yards") {
                    total = amount * 3;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Feet" && destination.getSelectedItem().toString() == "Miles") {
                    total = amount / 5280;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Feet" && source.getSelectedItem().toString() == "Miles") {
                    total = amount * 5280;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Feet" && destination.getSelectedItem().toString() == "Centimetres") {
                    total = amount * 30.48;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Feet" && source.getSelectedItem().toString() == "Centimetres") {
                    total = amount / 30.48;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Feet" && destination.getSelectedItem().toString() == "Metres") {
                    total = amount * 30.48;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Feet" && source.getSelectedItem().toString() == "Metres") {
                    total = amount / 30.48;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Feet" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 3281;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Feet" && source.getSelectedItem().toString() == "Kilometres") {
                    total = amount * 3281;
                    textView.setText(total.toString());
                }
                //yard
                else if (source.getSelectedItem().toString() == "Yards" && destination.getSelectedItem().toString() == "Centimetres") {
                    total = amount * 91.44;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Yards" && source.getSelectedItem().toString() == "Centimetres") {
                    total = amount / 91.44;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Yards" && destination.getSelectedItem().toString() == "Miles") {
                    total = amount / 1760;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Yards" && source.getSelectedItem().toString() == "Miles") {
                    total = amount * 1760;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Yards" && destination.getSelectedItem().toString() == "Metres") {
                    total = amount / 1.094;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Yards" && source.getSelectedItem().toString() == "Metres") {
                    total = amount * 1.094;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Yards" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 1094;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Yards" && source.getSelectedItem().toString() == "Kilometres") {
                    total = amount * 1094;
                    textView.setText(total.toString());
                }

                //Cm
                else if (source.getSelectedItem().toString() == "Centimetres" && destination.getSelectedItem().toString() == "Metres") {
                    total = amount / 100;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Centimetres" && source.getSelectedItem().toString() == "Metres") {
                    total = amount * 100;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Centimetres" && destination.getSelectedItem().toString() == "Miles") {
                    total = amount / 160900;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Centimetres" && source.getSelectedItem().toString() == "Miles") {
                    total = amount * 160900;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Centimetres" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 100000;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Centimetres" && source.getSelectedItem().toString() == "Kilometres") {
                    total = amount * 10000;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Centimetres" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 100000;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Metres" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 1000;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Metres" && source.getSelectedItem().toString() == "Kilometres") {
                    total = amount * 1000;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Metres" && destination.getSelectedItem().toString() == "Miles") {
                    total = amount / 1609;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Metres" && source.getSelectedItem().toString() == "Miles") {
                    total = amount * 1609;
                    textView.setText(total.toString());
                }


                //Miles
                else if (source.getSelectedItem().toString() == "Miles" && destination.getSelectedItem().toString() == "Centimetres") {
                    total = amount * 160900;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Miles" && source.getSelectedItem().toString() == "Centimetres") {
                    total = amount / 160900;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Miles" && destination.getSelectedItem().toString() == "Metres") {
                    total = amount * 1609;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Miles" && source.getSelectedItem().toString() == "Metres") {
                    total = amount / 1609;
                    textView.setText(total.toString());
                }

                else if (source.getSelectedItem().toString() == "Miles" && destination.getSelectedItem().toString() == "Kilometres") {
                    total = amount * 1.609;
                    textView.setText(total.toString());
                }

                else if (destination.getSelectedItem().toString() == "Miles" && source.getSelectedItem().toString() == "Kilometres") {
                    total = amount / 1.609;
                    textView.setText(total.toString());
                }

            }
        });


    }
}