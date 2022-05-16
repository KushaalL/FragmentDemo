package com.example.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class RedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_blue,null);
        TextView redText = fragmentView.findViewById(R.id.blue_fragment_text);
        redText.setText(("This is from the red fragment"));
        return fragmentView;
    }
}