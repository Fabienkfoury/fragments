package com.example.kfouryf.myfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        switch (v.getId()) {
            case R.id.dynamicFragments:
                startActivity(new Intent(this, DynamicActivity.class));
                break;

            case R.id.listFragments:
                startActivity(new Intent(this, DynamicActivity.class));
                break;
        }
    }
}

