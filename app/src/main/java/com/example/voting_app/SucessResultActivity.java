package com.example.voting_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SucessResultActivity extends AppCompatActivity {
    TextView voteTv;
    String voteTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess_result);

        voteTo = getIntent().getStringExtra("vote");
        voteTv = findViewById(R.id.voteTv);
        voteTv.setText(voteTo);

    }
}