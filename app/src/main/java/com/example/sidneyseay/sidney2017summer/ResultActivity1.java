package com.example.sidneyseay.sidney2017summer;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by sidneyseay on 6/26/17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("Data", "data");
        setResult(RESULT_OK, intent);
        //setResult(200, new Intent().putExtra("Data","data"));
        super.onBackPressed();
    }
}