package com.zacsolution.demoproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {
Button login;
TextView forger_pass,tv_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        final EditText user_name=(EditText)findViewById(R.id.username);
        final EditText pass = (EditText)findViewById(R.id.pass);
        Button login = (Button)findViewById(R.id.login);
        tv_register=(TextView)findViewById(R.id.tv_register);
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Activity.this,Terms_Conditions.class);
                startActivity(intent);
            }
        });
        forger_pass = (TextView)findViewById(R.id.forger_pass);
        forger_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Activity.this,Forget_Password.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user_name.getText().toString().equals("admin")&&pass.getText().toString().equals("123456"))
                {
                    Intent intent = new Intent(Login_Activity.this,Home.class);
                    startActivity(intent);
                }else
                    {
                        ChoseOption();
                    }
            }
        });
    }
    private void ChoseOption()
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Login_Activity.this);
        LayoutInflater inflater = Login_Activity.this.getLayoutInflater();
            final View dialogView = inflater.inflate(R.layout.wrong_keys, null);
            builder.setView(dialogView);
            Button home;
        home=(Button)dialogView.findViewById(R.id.home);
          home.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
              Intent intent = new Intent(Login_Activity.this,Login_Activity.class);
              startActivity(intent);
              finish();
              }
          });


        builder.setCancelable(false);

        builder.show();
    }
}
