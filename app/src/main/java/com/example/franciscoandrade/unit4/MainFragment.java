package com.example.franciscoandrade.unit4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View v;



    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_main, container, false);

        Button btnMainFragment= (Button)v.findViewById(R.id.btnMainFragment);


        btnMainFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                DisplayFragment displayFragment= new DisplayFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.mainFragmentContainer, displayFragment).commit();
                fragmentManager.popBackStack();

            }
        });

        return v;
    }

}
