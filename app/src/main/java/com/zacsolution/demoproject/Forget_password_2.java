package com.zacsolution.demoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Forget_password_2 extends AppCompatActivity {
    Button btn_next;
    ImageView cross;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_2);
        cross=(ImageView)findViewById(R.id.img_cross);
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forget_password_2.this,Login_Activity.class);
                startActivity(intent);
            }
        });

        btn_next=(Button)findViewById(R.id.next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forget_password_2.this,Forget_Password_3.class);
                startActivity(intent);
            }
        });
    }
}
