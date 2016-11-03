package com.example.kfouryf.myfragments.ListFragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kfouryf.myfragments.ListFragment.ListFragmentActivity;
import com.example.kfouryf.myfragments.Multi_Panel.MultiPanelActivity;
import com.example.kfouryf.myfragments.R;
import com.example.kfouryf.myfragments.data.Candidates;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment extends ListFragment implements AdapterView.OnItemClickListener {


    public ItemFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setSelector(android.R.color.darker_gray);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, Candidates.candidateNames));
        if (getActivity() instanceof ListFragmentActivity) {
            getListView().setOnItemClickListener(this);
        }

        if (getActivity() instanceof MultiPanelActivity) {
            getListView().setOnItemClickListener((MultiPanelActivity) getActivity());
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), Candidates.candidateNames[position], Toast.LENGTH_SHORT).show();
    }

}
