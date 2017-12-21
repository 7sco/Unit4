package com.example.franciscoandrade.unit4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {

    View v;

    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_display, container, false);


        TopFragment topFragment= new TopFragment();

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.topContainer, topFragment).commit();


        BottomFragment bottomFragment= new BottomFragment();

        FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();

        fragmentManager2.beginTransaction().replace(R.id.bottomContainer, bottomFragment).commit();




        return v;

    }

}
