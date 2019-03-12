package com.kcauniversity.schoolassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class focimActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.rbbach) RadioButton mRbbach;
    @BindView(R.id.btnselect) Button mBtnselect;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.focim);
        ButterKnife.bind(this);

        mBtnselect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            if (v == mBtnselect){
                Intent intent = new Intent(focimActivity.this, BachelorsActivity.class);
                startActivity(intent);

            }
    }
}
