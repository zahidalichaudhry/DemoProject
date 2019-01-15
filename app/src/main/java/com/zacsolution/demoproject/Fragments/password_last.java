package com.zacsolution.demoproject.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zacsolution.demoproject.Home;
import com.zacsolution.demoproject.R;


public class password_last extends Fragment {
    public password_last() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.activity_forget_password_5, container, false);
        Button btn_next = (Button) view.findViewById(R.id.next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getActivity(), Home.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
