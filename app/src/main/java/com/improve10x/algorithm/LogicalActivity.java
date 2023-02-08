package com.improve10x.algorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class LogicalActivity extends AppCompatActivity {
    SeekBar aSb;
    SeekBar bSb;
    TextView resultTxt;
    Button checkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical);
        handleIntiViews();
        handleCheckBtn();
    }


    private void handleIntiViews() {
        aSb = findViewById(R.id.a_sb);
        bSb = findViewById(R.id.b_sb);
        resultTxt = findViewById(R.id.result_txt);
        checkBtn = findViewById(R.id.check_btn);
    }

    private void handleCheckBtn() {
        checkBtn.setOnClickListener(v -> {
            int input1 = aSb.getProgress();
            int input2 = bSb.getProgress();
            String result = sumIsLessThan100(input1,input2);
            resultTxt.setText(result);
        });
    }

    private String sumIsLessThan100(int input1, int input2) {
        boolean result = false;
        if (input1 + input2<100){
            result = true;
        }
        return result + "";
    }

    @Override
    protected void onPause() {
        super.onPause();
        aSb.setProgress(0);
        bSb.setProgress(0);
        resultTxt.setText("");
    }
}