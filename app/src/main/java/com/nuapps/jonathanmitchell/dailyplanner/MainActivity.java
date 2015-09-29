package com.nuapps.jonathanmitchell.dailyplanner;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_container);


        /*getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container,new MainFragment())
                .commit();*/


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        MainFragment f = new MainFragment();

        transaction.add(R.id.fragment_container,f);

        transaction.commit();
    }

}
