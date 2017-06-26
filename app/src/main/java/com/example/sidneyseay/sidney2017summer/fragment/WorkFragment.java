package com.example.sidneyseay.sidney2017summer.fragment;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sidneyseay.sidney2017summer.R;
import com.example.sidneyseay.sidney2017summer.BaseActivity;
import com.example.sidneyseay.sidney2017summer.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**h
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkFragment extends Fragment {
    public WorkFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work, container, false);

    }

    @OnClick(R.id.submit_button)
    public void clickSubmit(View v) {
        Toast.makeText(getContext(), "Submission is Successful!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.quiz1)
    public void clickQuiz1(View v) {
        Toast.makeText(WorkFragment.this.getContext()
                , "Quiz 1: 6/19/17!", Toast.LENGTH_SHORT).show();
    }

    }
