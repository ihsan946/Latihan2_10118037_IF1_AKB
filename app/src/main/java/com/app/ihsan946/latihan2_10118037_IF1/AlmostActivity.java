//NIM : 10118037
//NAMA : Muhammad Ihsan
//Kelas : IF-1/S1/VI
//Copyright : April 2021

package com.app.ihsan946.latihan2_10118037_IF1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void pindahVerify(View view){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);

    }
}
