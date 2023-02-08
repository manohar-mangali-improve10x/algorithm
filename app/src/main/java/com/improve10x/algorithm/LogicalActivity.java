package com.improve10x.algorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogicalActivity extends AppCompatActivity {
    EditText aTxt;
    EditText bTxt;
    TextView resultTxt;
    Button checkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical);
        handleCheckBtn();
        handleIntiViews();
    }

    private void handleIntiViews() {
        aTxt = findViewById(R.id.a_txt);
        bTxt = findViewById(R.id.b_txt);
        resultTxt = findViewById(R.id.result_txt);
        checkBtn = findViewById(R.id.check_btn);
    }

    private void handleCheckBtn() {
        checkBtn.setOnClickListener(view -> {
            String input1 = aTxt.getText().toString();
            String input2 =bTxt.getText().toString();
            String result = sumIsLessThan100(input1,input2);
            resultTxt.setText(result);

        });
    }

    private String sumIsLessThan100(String input1, String input2) {
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);
        boolean result= false;
        if (a + b <100){
            result = true;
        }
        return result + " ";

    }

}