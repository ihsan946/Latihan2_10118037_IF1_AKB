//NIM : 10118037
//NAMA : Muhammad Ihsan
//Kelas : IF-1/S1/VI
//Copyright : April 2021

package com.app.ihsan946.latihan2_10118037_IF1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void pindahLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

    public void pindahAlmost(View view){
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);

    }

}
