//NIM : 10118037

//Nama : Muhammad Ihsan
//Kelas : IF-1/S1/VI
//Dibuat : 29 April 2021
//Copyright 2021

package com.app.ihsan946.tugas3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get data intent
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(BiodataActivity.EXTRA_MESSAGE);

        //set text
        TextView teks2 = findViewById(R.id.teks2_main);
        teks2.setText(pesan);
        TextView teks6 = findViewById(R.id.teks6_main);
        teks6.setText(pesan);

    }
}