package com.example.sidneyseay.sidney2017summer;

/**
 * Created by sidneyseay on 6/21/17.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityB extends BaseActivity {

    @OnClick(R.id.activity_b_a)
    public void toA(View view){
        goToActivity(ActivityA.class);

    }

    @Override
    public void showToast(String s) {
        super.showToast(s);
    }

    @OnClick(R.id.activity_b_b)
    public void toB(View view){
        goToActivity(ActivityB.class);
    }


    @OnClick(R.id.activity_b_c)
    public void toC(View view){
        goToActivity(ActivityC.class);
    }

    @OnClick(R.id.activity_b_d)
    public void toD(View view){
        goToActivity(ActivityD.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ButterKnife.bind(this);
        showToast("onCreate");
    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        showToast("onNewIntent");
    }

}
