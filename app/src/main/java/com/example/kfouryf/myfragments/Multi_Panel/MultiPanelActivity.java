package com.example.kfouryf.myfragments.Multi_Panel;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kfouryf.myfragments.ListFragment.ItemFragment;
import com.example.kfouryf.myfragments.R;
import com.example.kfouryf.myfragments.data.Candidates;

public class MultiPanelActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_panel);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentLeft, new
                    ItemFragment()).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentRight, new
                    DetailsFragment()).commit();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        DetailsFragment detailsFragmentNew = new DetailsFragment();
//        Bundle bundle = new Bundle();
//        bundle.putInt(DetailsFragment.POSITION, position);
//        detailsFragmentNew.setArguments(bundle);
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.fragmentRight, detailsFragmentNew);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();

         ((TextView) findViewById(R.id.description)).setText(Candidates.candidateDetails[position]);  //A ajouter
        ((ImageView) findViewById(R.id.imageView)).setImageResource(Candidates.candidatePhotos[position]);
    }
}
