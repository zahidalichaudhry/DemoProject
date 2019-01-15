package com.zacsolution.demoproject;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Forget_Password_3 extends AppCompatActivity {
    Button btn_next;
    EditText username1,username2,userpass1,userpass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password_3);
        btn_next=(Button)findViewById(R.id.next);
        username1=(EditText)findViewById(R.id.username1);
        username2=(EditText)findViewById(R.id.username2);
        userpass1=(EditText)findViewById(R.id.pass1);
        userpass2=(EditText)findViewById(R.id.pass2);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username1.getText().toString().length()==0
                        ||username2.getText().toString().length()==0
                        ||userpass1.getText().toString().length()==0
                        ||userpass2.getText().toString().length()==0)
                {
                    ChoseOption();

                }else
                {
                    Intent intent = new Intent(Forget_Password_3.this,Forget_password_5.class);
                    startActivity(intent);
                }

            }
        });
    }
    private void ChoseOption()
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Forget_Password_3.this);
        LayoutInflater inflater = Forget_Password_3.this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.wrong_keys, null);
        builder.setView(dialogView);
        Button home;
        home=(Button)dialogView.findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forget_Password_3.this,Forget_Password.class);
                startActivity(intent);
            }
        });


        builder.setCancelable(false);

        builder.show();
    }
}
