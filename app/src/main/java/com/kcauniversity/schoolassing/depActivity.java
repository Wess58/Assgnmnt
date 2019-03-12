package com.kcauniversity.schoolassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class depActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.btnfocim)  Button mBtnfocim;
    @BindView(R.id.btnsob)   Button mBtnsob;
    @BindView(R.id.btnspp)  Button mBtnspp;
    @BindView(R.id.btnfoed)  Button mBtnfoed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mBtnfocim) {
            Intent intent = new Intent(depActivity.this, focimActivity.class);
            startActivity(intent);
        }
        if (v == mBtnsob) {
            Intent intent = new Intent(depActivity.this, sobActivity.class);
            startActivity(intent);

        }
        if (v == mBtnspp) {
            Intent intent = new Intent(depActivity.this, sspActivity.class);
            startActivity(intent);
        }
        if (v == mBtnfoed) {
            Intent intent = new Intent(depActivity.this, foedActivity.class);
            startActivity(intent);
        }
    }
}
