package com.akb.rifqi10118372;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    // 7-April-2021
    //10118372 Rifqi Muhammad Rizqullah IF-9

    //variable
    Button btn_masuk,btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_masuk = findViewById(R.id.BtnMasuk);
        btn_daftar = findViewById(R.id.BtnDaftar);
        login();
    }

    private void login() {
        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        });
    }
}