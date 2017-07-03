package com.example.sidneyseay.sidney2017summer.fragment;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.sidneyseay.sidney2017summer.R;
import com.example.sidneyseay.sidney2017summer.BaseActivity;
import com.example.sidneyseay.sidney2017summer.MainActivity;
import com.example.sidneyseay.sidney2017summer.dialog.CustomDialog;
import com.example.sidneyseay.sidney2017summer.dialog.DialogQuiz3;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.sidneyseay.sidney2017summer.R.id.quiz2;

/**h
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */


public class WorkFragment extends Fragment {
    Button quiz2;
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
        View v = inflater.inflate(R.layout.fragment_work, container, false);
        quiz2 = (Button) v.findViewById(R.id.quiz2);
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogQuiz3 customDialog = new DialogQuiz3(getContext(), new CustomDialog.ICustomDialogListener() {
                    @Override
                    public void onOKClicked(String msg) {
                        Toast.makeText(getContext(),msg,Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.setCanceledOnTouchOutside(true);
                customDialog.show();
            }
        });
            return v;
    }

    @OnClick(R.id.submit_button)
    public void clickSubmit(View v) {
        Toast.makeText(getContext(), "Submission is Successful!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.quiz1)
    public void clickQuiz1(View v) {
        Toast.makeText(getContext()
                , "Quiz 1: 6/19/17!", Toast.LENGTH_SHORT).show();
    }


    }
