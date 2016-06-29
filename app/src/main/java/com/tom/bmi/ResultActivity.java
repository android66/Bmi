package com.tom.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        float bmi = intent.getFloatExtra(getString(R.string.bmi_extra), 0);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("您的BMI值為:"+bmi);
    }
}
