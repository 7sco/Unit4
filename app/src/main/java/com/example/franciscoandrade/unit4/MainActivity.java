package com.example.franciscoandrade.unit4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment= new MainFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragmentContainer, mainFragment).commit();

        
    }
}
