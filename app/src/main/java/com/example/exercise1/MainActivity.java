package com.example.exercise1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edE, edP;
    Button btn;
    TextView edDaf;
    String nama, password;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(),DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edE = findViewById(R.id.edEmail);
        edP = findViewById(R.id.edPassword);
        btn = findViewById(R.id.btSignin);
        edDaf = findViewById(R.id.edDaftar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nama = edE.getText().toString();
                password = edP.getText().toString();

                String email = "dimasagung913@mail.com";
                String pass = "123";

//                if (nama.isEmpty() && password.isEmpty()) {
//                    Toast t = Toast.makeText(getApplicationContext(),
//                            "Email dan Password Wajib Di Isi", Toast.LENGTH_LONG);
//                    t.show();
//
//                }else
//
                if (nama.isEmpty() && password.isEmpty()){
                    edE.setError("Email Tidak boleh kosong");
                    edP.setError("Password tidak boleh kosong");
                    Toast t = Toast.makeText(getApplicationContext(),
                          "Email dan Password Wajib Di Isi", Toast.LENGTH_LONG);
                   t.show();
                }
                else if (nama.equals(email) && password.isEmpty()){
                    edP.setError("Password tidak boleh kosong");
                }
                else if (nama.isEmpty() && password.equals(pass)){
                    edE.setError("email tidak boleh kosong");
                }
                else {
                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses",
                                Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());
                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), Home_Activity.class);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });

        edDaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
                startActivity(i);
            }
        });
    }

}