package com.example.sidneyseay.sidney2017summer;

/**
 * Created by sidneyseay on 6/26/17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;

public class ResultActivity extends BaseActivity {

    private final int ACTIVITY1 = 123;
    private final int ACTIVITY2 = 321;

    @OnClick(R.id.activity_result_bt1)
    public void toResult1(View view){
        Intent intent = new Intent(this, ResultActivity1.class);
        startActivityForResult(intent, ACTIVITY1);
    }

    @OnClick(R.id.activity_result_bt2)
    public void toResult2(View view){
        Intent intent = new Intent(this, ResultActivity1.class);
        startActivityForResult(intent, ACTIVITY2);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String s = data.getStringExtra("Data");
        switch (requestCode){
            case ACTIVITY1:
                shortToast("FromResultActivity1");
                break;
            case ACTIVITY2:
                shortToast("FromResultActivity2");
                break;
        }
    }
}