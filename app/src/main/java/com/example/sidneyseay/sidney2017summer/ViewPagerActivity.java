package com.example.sidneyseay.sidney2017summer;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.sidneyseay.sidney2017summer.adapter.BaseViewPagerAdapter;
import com.example.sidneyseay.sidney2017summer.fragment.BlueFragment;
import com.example.sidneyseay.sidney2017summer.fragment.GreenFragment;
import com.example.sidneyseay.sidney2017summer.fragment.RedFragment;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();
    private BaseViewPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle","onCreate");
        viewPager = (ViewPager)findViewById(R.id.activity_view_pager);
        list.add(new RedFragment());
        list.add(new GreenFragment());
        list.add(new BlueFragment());
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
    }
}
