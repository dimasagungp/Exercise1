package com.example.exercise1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHasil extends AppCompatActivity {

    TextView txEmail, txPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txEmail = findViewById(R.id.TvEmail);
        txPass = findViewById(R.id.TvPass);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String Pass = bundle.getString("b");

        txEmail.setText(email);
        txPass.setText(Pass);

    }
}