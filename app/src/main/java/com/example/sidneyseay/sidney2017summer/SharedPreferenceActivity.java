package com.example.sidneyseay.sidney2017summer;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SharedPreferenceActivity extends BaseActivity {

    @BindView(R.id.activity_shared_preference_email)
    EditText emailEditText;
    @BindView(R.id.activity_shared_preference_password)
    EditText passwordEditText;

    private final String EMAIL ="email";
    private final String PASSWORD = "password";
    private final String USER = "user";

    @OnClick(R.id.activity_shared_preference_clear)
    public void clear(View v){
            SharedPreferences sp = getSharedPreferences(USER, MODE_PRIVATE);
        SharedPreferences.Editor editor =sp.edit();
        editor.clear();
        //editor.remove(PASSWORD);
        //editor.commit();
        emailEditText.setText("");
        passwordEditText.setText("");
        shortToast("You cleared all the content!");
        }



    @OnClick(R.id.activity_shared_preference_login)
    public void login(View v){
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        if (check(email,password)) {
            shortToast("Login Success");
        }
    }

    private boolean check(String email, String password){
        boolean passwordCorrect = true;
        if(passwordCorrect){
            SharedPreferences sp = getSharedPreferences(USER, MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(EMAIL, email);
            editor.putString(PASSWORD,password);
            editor.commit();
            return true;

        }else{
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        ButterKnife.bind(this);
        retreiveLoginInfo();
    }
    private void retreiveLoginInfo(){
        SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
        String email = sp.getString(EMAIL,"null");
        String password = sp.getString(PASSWORD, "null");
      //  if (!email.equals("null")
    }

}
