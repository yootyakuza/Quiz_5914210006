package com.example.apple.quiz_5914210006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class Activity3HasCode extends AppCompatActivity {

    NumberPicker np1,np2,np3;
    Button btOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_has_code);

        np1 = (NumberPicker)findViewById(R.id.numberPicker1);
        np2 = (NumberPicker)findViewById(R.id.numberPicker2);
        np3 = (NumberPicker)findViewById(R.id.numberPicker3);
        btOK = (Button)findViewById(R.id.butOk);

        final String[] data = {"1","2","3","4","5","6","7","8","9"};
        final String[] data2 = {"1","2","3","4","5","6","7","8","9"};
        final String[] data3 = {"1","2","3","4","5","6","7","8","9"};

        np1.setDisplayedValues(data);
        np2.setDisplayedValues(data2);
        np3.setDisplayedValues(data3);

        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

            }
        });
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

            }
        });
        np3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

            }
        });
        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
