package com.example.franciscoandrade.unit4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {

    View v;
    List<JSONObject> list= new ArrayList<>();
   // JSONArray jsonArray;

    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_bottom, container, false);


        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("Pet",new JSONArray().put(new JSONObject().put("Dog", "Luna"))
//                .put(new JSONObject().put("Dog", "Ginger"))
//                .put(new JSONObject().put("Dog", "Bread")));
        try {
            jsonObject.put("books", new JSONArray()
                    .put(new JSONObject().put("title","Northanger Abbey" ).put("author", "Austen, Jane").put("year", 1814))
                    .put(new JSONObject().put("title","War and Peace" ).put("author", "Tolstoy, Leo").put("year", 1865))
                    .put(new JSONObject().put("title","Anna Karenina" ).put("author", "Tolstoy, Leo").put("year", 1875))
                    .put(new JSONObject().put("title","Mrs. Dalloway" ).put("author", "Woolf, Virginia").put("year", 1925))
                    .put(new JSONObject().put("title","The Hours" ).put("author", "Cunnningham, Michael").put("year", 1999))
                    .put(new JSONObject().put("title","Huckleberry Finn" ).put("author", "Twain, Mark").put("year", 1865))
                    .put(new JSONObject().put("title","Tom Sawyer" ).put("author", "Twain, Mark").put("year", 1862))

                    );
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray=new JSONArray();


        //Log.d("RESULT==", "onCreateView: "+ jsonObject.getJSONArray("books").get(0));
        try {
            jsonArray=jsonObject.getJSONArray("books");


            //Log.d("RESULT==", "onCreateView: "+ jsonArray.getJSONObject(0));


            for(int i=0; i<jsonArray.length(); i++){

                list.add(jsonArray.getJSONObject(i));
                //Log.d("RESULT==", "onCreateView: "+ jsonArray.getJSONObject(0));

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d("RESULT==", "onCreateView: "+ list.get(0));

        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.recyclerView);

        TitleAdapter titleAdapter= new TitleAdapter(list, getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);


        recyclerView.setAdapter(titleAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);






        return  v;
    }

}
