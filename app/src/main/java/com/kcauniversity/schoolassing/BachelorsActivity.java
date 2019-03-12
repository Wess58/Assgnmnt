package com.kcauniversity.schoolassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BachelorsActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.categoriesList) ListView mCategoriesList;
    @BindView(R.id.submit) Button mSubmit;


    private String[] categories = new String[]{
            "BBIT", "BscSD" , "BscIT" , "BscPM", "BscISF"};
    private String [] missing = new String []{"not available"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bachelors);
        ButterKnife.bind(this);

        mSubmit.setOnClickListener(this);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, categories );
        mCategoriesList.setAdapter(adapter);

        mCategoriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String missing = ((TextView)view).getText().toString();
                Toast.makeText(BachelorsActivity.this, "Selected course", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == mSubmit){
            Intent intent = new Intent(BachelorsActivity.this, depActivity.class);
            startActivity(intent);
            Toast.makeText(BachelorsActivity.this, "Registered course", Toast.LENGTH_LONG).show();

        }
    }
}
