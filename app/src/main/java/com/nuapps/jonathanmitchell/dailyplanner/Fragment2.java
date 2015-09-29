package com.nuapps.jonathanmitchell.dailyplanner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by jonathanmitchell on 9/28/15.
 */
public class Fragment2 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2,container,false);

        Button beeButton = (Button)v.findViewById(R.id.button_bee_button);

        return v;
    }
}
