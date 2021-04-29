
//NIM : 10118037
//Nama : Muhammad Ihsan
//Kelas : IF-1/S1/VI
//Dibuat : 29 April 2021
//Copyright 2021


package com.app.ihsan946.tugas3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.app.ihsan946.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void pindahMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText nama = findViewById(R.id.nama_biodata);
        String message = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

    }
}