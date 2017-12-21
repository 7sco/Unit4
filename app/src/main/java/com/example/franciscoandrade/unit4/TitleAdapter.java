package com.example.franciscoandrade.unit4;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by franciscoandrade on 12/20/17.
 */

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleViewHolder> {
    List<JSONObject> lista;
    Context context;


    public TitleAdapter(List<JSONObject> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public TitleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);


        return new TitleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TitleViewHolder holder, final int position) {



        try {
            holder.recyclerText.setText(lista.get(position).get("title").toString());


        holder.containerTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TopFragment topFragment= new TopFragment();

                Bundle bundle = new Bundle();
                try {
                    bundle.putString("title", lista.get(position).get("title").toString());
                    bundle.putString("author", lista.get(position).get("author").toString());
                    bundle.putString("year", lista.get(position).get("year").toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                topFragment.setArguments(bundle);

                android.support.v4.app.FragmentManager fragmentManager = ((FragmentActivity)context).getSupportFragmentManager();

                fragmentManager.beginTransaction().replace(R.id.topContainer, topFragment).commit();



            }
        });

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class TitleViewHolder extends RecyclerView.ViewHolder {


        TextView recyclerText;
        LinearLayout containerTitle;

        public TitleViewHolder(View itemView) {
            super(itemView);


            recyclerText=(TextView)itemView.findViewById(R.id.recyclerText);
            containerTitle=(LinearLayout) itemView.findViewById(R.id.containerTitle);
        }
    }
}
