package com.example.sidneyseay.sidney2017summer;

/**
 * Created by sidneyseay on 6/26/17.
 */

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.sidneyseay.sidney2017summer.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogActivity extends BaseActivity {

    private int checkedID = 0;


    @BindView(R.id.activity_dialog)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialog_ok)
    public void ok(View view){
        switch (checkedID){
            case R.id.dlg1:
                normalDialog();
                break;
            case R.id.dlg2:
                listDialog();
                break;
            case R.id.dlg3:
                //singleChoiceDialog();
                break;
            case R.id.dlg4:
                break;
            case R.id.dlg5:
                break;
            case R.id.dlg6:
                break;
            case R.id.dlg7:
                break;
            case R.id.dlg8:
                CustomDialog customDialog = new CustomDialog(this, new CustomDialog.ICustomDialogListener() {
                    @Override
                    public void onOKClicked(String msg) {
                        shortToast(msg);
                    }
                });
                customDialog.setCanceledOnTouchOutside(true);
                customDialog.show();
                break;
            default:
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                shortToast("YOu chose: " + checkedId);
                checkedID = checkedId;
            }
        });
    }

    private void normalDialog(){

    }

    private void listDialog(){

    }
}