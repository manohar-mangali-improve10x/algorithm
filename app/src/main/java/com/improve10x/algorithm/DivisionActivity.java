package com.improve10x.algorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivisionActivity extends AppCompatActivity {
    EditText editTextTxt;
    Button divisionBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        handleInitViews();
        handleDivisionBtn();
    }

    private void handleDivisionBtn() {
        divisionBtn.setOnClickListener(v -> {
            String number = editTextTxt.getText().toString();
            String result = divisionBy5(number);
            resultTxt.setText(result);


        });
    }

    private String divisionBy5(String number) {
        int a = Integer.parseInt(number);
        boolean result = false;
        if (a % 5 ==0){
            result = true;
        }
        return result + "";
    }

    private void handleInitViews() {
        editTextTxt = findViewById(R.id.edittext_txt);
        resultTxt = findViewById(R.id.result_txt);
        divisionBtn = findViewById(R.id.division_btn);
    }

    @Override
    protected void onPause() {
        super.onPause();
        editTextTxt.setText("");
        resultTxt.setText("");
    }
}