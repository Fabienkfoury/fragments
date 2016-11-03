package com.example.kfouryf.myfragments.Basis_fragments;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kfouryf.myfragments.Basis_fragments.BlankFragment;
import com.example.kfouryf.myfragments.Basis_fragments.BlankFragment2;
import com.example.kfouryf.myfragments.R;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            BlankFragment frag1 = new BlankFragment();
            fragmentTransaction.replace(R.id.activity_dynamic, frag1);
        } else {
            BlankFragment2 frag2 = new BlankFragment2();
            fragmentTransaction.replace(R.id.activity_dynamic, frag2);
        }
        fragmentTransaction.commit();
    }
}

