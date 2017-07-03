package com.example.sidneyseay.sidney2017summer.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sidneyseay.sidney2017summer.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceActivity extends AppCompatActivity {

    @BindView(R.id.activity_advance_list_view)
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
    }
}