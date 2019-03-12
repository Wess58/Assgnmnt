package com.kcauniversity.schoolassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class login extends AppCompatActivity implements View.OnClickListener {
@BindView(R.id.username) EditText mUsername;
@BindView(R.id.password) EditText mPassword;
@BindView(R.id.loginbtn)Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    if (v == mLogin){
        Intent intent = new Intent(login.this, depActivity.class );
        startActivity(intent);
        Toast.makeText(login.this, "LOGGED IN", Toast.LENGTH_SHORT).show();
    }
    }
}
