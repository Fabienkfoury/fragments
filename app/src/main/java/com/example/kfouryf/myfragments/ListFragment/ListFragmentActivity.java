package com.example.kfouryf.myfragments.ListFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kfouryf.myfragments.R;

public class ListFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fragment);

        getSupportFragmentManager().beginTransaction().add(R.id.activity_list_fragment, new ItemFragment()).commit();
    }
}
