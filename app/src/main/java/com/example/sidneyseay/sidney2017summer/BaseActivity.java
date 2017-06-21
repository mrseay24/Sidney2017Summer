package com.example.sidneyseay.sidney2017summer;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by sidneyseay on 6/17/17.
 */

public class BaseActivity extends AppCompatActivity {
    public void showToast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
