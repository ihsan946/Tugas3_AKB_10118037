
//NIM : 10118037
//Nama : Muhammad Ihsan
//Kelas : IF-1/S1/VI
//Dibuat : 29 April 2021
//Copyright 2021

package com.app.ihsan946.tugas3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Halaman1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
    }

    public void pindahLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}