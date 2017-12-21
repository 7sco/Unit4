package com.example.franciscoandrade.unit4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    View view;

    TextView title, author, year;

    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_top, container, false);

        author= (TextView)view.findViewById(R.id.author);
        title= (TextView)view.findViewById(R.id.title);
        year= (TextView)view.findViewById(R.id.year);

        Bundle bundle = getArguments();
        String authorText = bundle.getString("author", "");
        String titleText = bundle.getString("title", "");
        String yearText = bundle.getString("year", "");


        title.setText(titleText);
        author.setText(authorText);
        year.setText(yearText);

        return view;
    }

}
