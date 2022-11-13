package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTxt;
    private EditText firstNum, secondNum;
    private Button comBtn;
    private Button comBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultTxt=findViewById(R.id.resultTxt);
        firstNum= findViewById(R.id.firstNum);
        secondNum=findViewById(R.id.secondNum);
        comBtn=findViewById(R.id.comBtn);


        comBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res= Integer.parseInt(firstNum.getText().toString()) +Integer.parseInt(secondNum.getText().toString());
                resultTxt.setText("Result: "+ String.valueOf(res));
            }
        });
    }
}