package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ColourSelection extends AppCompatActivity {
    private ConstraintLayout conLayout;
    private RadioButton redBtn, greenBtn, blueBtn;
    private RadioGroup radioGrp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_selection);

        conLayout = findViewById(R.id.conLayout);
        redBtn= findViewById(R.id.redBtn);
        greenBtn=findViewById(R.id.greenBtn);
        blueBtn=findViewById(R.id.blueBtn);
        radioGrp=findViewById(R.id.radioGrp);

        radioGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // on below line we are getting radio button from our group.
                RadioButton radioButton = findViewById(checkedId);

                if(radioButton.getText().toString().equals("Red")){
                    conLayout.setBackgroundColor(Color.RED);
                }
                else if(radioButton.getText().toString().equals("Blue")){
                    conLayout.setBackgroundColor(Color.BLUE);
                }
                else if(radioButton.getText().toString().equals("Green")){
                    conLayout.setBackgroundColor(Color.GREEN);
                }

            }
        });



    }


}