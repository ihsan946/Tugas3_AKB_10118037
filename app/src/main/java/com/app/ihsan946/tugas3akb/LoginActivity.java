package com.app.ihsan946.tugas3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText kodelogin = findViewById(R.id.kode_login);

        //All capslock kode login
        kodelogin.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }

    public void pindahBiodata(View view) {
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);

    }
}