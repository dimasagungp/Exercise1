package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    private com.example.exercise1.ListViewAdapter adapter;

    String[] listNama;

    public static ArrayList<com.example.exercise1.ClassNama> classNamaArrayList = new ArrayList<com.example.exercise1.ClassNama>();

    Bundle bundle = new Bundle();

    Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listNama = new String[]{"Dimas", "Bondan", "Agung",
                "Burhan", "Habil", "Samsul", "Opah", "Ghazi",
                "Rendy", "Fajar"};

        list = findViewById(R.id.listKontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listNama.length; i++) {
            com.example.exercise1.ClassNama classNama = new com.example.exercise1.ClassNama(listNama[i]);

            classNamaArrayList.add(classNama);
        }

        adapter = new com.example.exercise1.ListViewAdapter(this);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String nama = classNamaArrayList.get(position).getName();

                bundle.putString("a", nama.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(),view);

                pm.setOnMenuItemClickListener(com.example.exercise1.Home_Activity.this);

                pm.inflate(R.menu.popup_menu);

                pm.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(), com.example.exercise1.ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "Ini Untuk Edit Kontak Ya!!!",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}



