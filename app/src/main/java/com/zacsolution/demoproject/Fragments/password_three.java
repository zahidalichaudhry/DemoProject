package com.zacsolution.demoproject.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.zacsolution.demoproject.Forget_Password;
import com.zacsolution.demoproject.Forget_password_5;
import com.zacsolution.demoproject.Home;
import com.zacsolution.demoproject.Login_Activity;
import com.zacsolution.demoproject.R;


public class password_three extends Fragment {
    public password_three() {
        // Required empty public constructor
    }

    String user1,user2,pass1,pass2;
    EditText username1,username2,userpass1,userpass2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.activity_forget__password_3, container, false);
        Button btn_next = (Button) view.findViewById(R.id.next);
        username1=(EditText)view.findViewById(R.id.username1);
        username2=(EditText)view.findViewById(R.id.username2);
        userpass1=(EditText)view.findViewById(R.id.pass1);
        userpass2=(EditText)view.findViewById(R.id.pass2);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username1.getText().toString().equals("admin")
                        &&username2.getText().toString().equals("admin")
                        &&userpass1.getText().toString().equals("123456")
                        &&userpass2.getText().toString().equals("123456"))
                {
                    Intent intent = new Intent(getActivity(),Forget_password_5.class);
                    startActivity(intent);
                }else
                {
                    ChoseOption();
                }

            }
        });
        return view;
    }

    private void ChoseOption()
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.wrong_keys, null);
        builder.setView(dialogView);
        Button home;
        home=(Button)dialogView.findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Forget_Password.class);
                startActivity(intent);
            }
        });


        builder.setCancelable(false);

        builder.show();
    }

}
