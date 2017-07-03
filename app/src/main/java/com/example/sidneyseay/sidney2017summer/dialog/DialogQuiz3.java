package com.example.sidneyseay.sidney2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.sidneyseay.sidney2017summer.R;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by sidneyseay on 7/3/17.
 */

public class DialogQuiz3 extends Dialog {
    private final CustomDialog.ICustomDialogListener listener;

    private HashMap<String,Boolean> list = new HashMap<String,Boolean>();

    @BindView(R.id.Quiz2_radiobt_yes)
    RadioButton yes;

    @BindView(R.id.Quiz2_radiobt_no)
    RadioButton no;

    @BindView(R.id.Quiz2_radiobt_exit)
    RadioButton exit;

    @BindView(R.id.Quiz2_radiogroup)
    RadioGroup radioGroup;

    public interface ICustomDialogListner{
        public void onOKClicked(String msg);
    }



    @OnClick(R.id.Quiz2_ok_bt)
    public void ok(View view){
        String s = "";
        for (Map.Entry<String,Boolean> entry: list.entrySet()){
            if(entry.getValue()){
                s=s+entry.getKey();
            }
        }

        listener.onOKClicked(s);
        if(s.equals("Exit")){
            System.exit(0);
        }else{
            cancel();
        }
    }


    @OnClick(R.id.Quiz2_cancel_bt)
    public void exit(View view){
        cancel();
    }

    public DialogQuiz3(@NonNull Context context, CustomDialog.ICustomDialogListener listener) {
        super(context,R.style.dialog);
        setContentView(R.layout.dialog_quiz3);
        ButterKnife.bind(this);
        this.listener = listener;
        yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                list.put(buttonView.getText().toString(),isChecked);
            }
        });

        no.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                list.put(buttonView.getText().toString(),isChecked);
            }
        });

        exit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                list.put(buttonView.getText().toString(),isChecked);
            }
        });
    }
}
