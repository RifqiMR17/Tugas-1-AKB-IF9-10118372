package com.akb.rifqi10118372;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // 7-April-2021
    //10118372 Rifqi Muhammad Rizqullah IF-9

    //variable
    EditText username,password;
    Button btn_masuk,btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        btn_masuk = findViewById(R.id.BtnMasuk);
        btn_daftar = findViewById(R.id.BtnDaftar);
        daftar();
        login();
    }

    private void daftar() {
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                finish();
            }
        });
    }

    private void login() {
        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                    Toast.makeText(LoginActivity.this,"Login Anda Sukses",Toast.LENGTH_LONG).show();}
                    else {
                    Toast.makeText(LoginActivity.this,"Login anda gagal, periksa kembali username dan password anda",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}