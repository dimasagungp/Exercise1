package com.example.exercise1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Dimas":
                tvnama.setText("Dimas Agung P");
                tvnomor.setText("085600783930");
                break;
            case "Bondan" :
                tvnama.setText("Bondan Adji");
                tvnomor.setText("085700839798");
                break;
            case "Agung" :
                tvnama.setText("Agung MArpaung");
                tvnomor.setText("085437239");
                break;
            case "burhan" :
                tvnama.setText("burhan Aji");
                tvnomor.setText("088812987650");
                break;
            case "habil" :
                tvnama.setText("M habil");
                tvnomor.setText("088760987640");
                break;
            case "Samsul" :
                tvnama.setText("Samsul Ari");
                tvnomor.setText("08218912227");
                break;
            case "Opah" :
                tvnama.setText("Muaropah");
                tvnomor.setText("0822891222099");
                break;
            case "Ghazi" :
                tvnama.setText("ghazi zulava");
                tvnomor.setText("0822892209908");
                break;
            case "Rendy" :
                tvnama.setText("Rendy Ilham");
                tvnomor.setText("082289220765");
                break;
            case "Fajar" :
                tvnama.setText("Fajar Ilham");
                tvnomor.setText("082289704443");
                break;
        }
    }
}
