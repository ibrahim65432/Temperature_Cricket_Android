package com.edureka.training.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView prompt;
    EditText etNumber;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prompt = findViewById(R.id.tvPrompt);
        etNumber = findViewById(R.id.etNumber);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalChirp = Integer.parseInt(etNumber.getText().toString().trim());
                double result = (totalChirp/3.0) + 4;
                String statement = "The approximate temperature outside is " + result + " degrees Celsius";
                tvResult.setText(statement);
                tvResult.setVisibility(View.VISIBLE);
            }
        });

    }
}