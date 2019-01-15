package com.zacsolution.demoproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;

public class Terms_Conditions extends AppCompatActivity {
    FloatingActionButton ft_down;
    Button next;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms__conditions);
        scrollView=(ScrollView)findViewById(R.id.scrollView);
        ft_down=(FloatingActionButton)findViewById(R.id.btn_down);
        next=(Button)findViewById(R.id.next);
        next.setEnabled(false);
        next.setBackgroundColor(ContextCompat.getColor(this, R.color.greyshade));
        ft_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next.setEnabled(true);
                next.setBackgroundColor(ContextCompat.getColor(Terms_Conditions.this,R.color.orige));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Terms_Conditions.this,Registration.class);
                startActivity(intent);
            }
        });
        scrollView.getViewTreeObserver()
                .addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                    @Override
                    public void onScrollChanged() {
                        if (scrollView.getChildAt(0).getBottom()
                                <= (scrollView.getHeight() + scrollView.getScrollY())) {
                          next.setEnabled(true);
                            next.setBackgroundColor(ContextCompat.getColor(Terms_Conditions.this,R.color.orige));
                        } else {
                            //scroll view is not at bottom
                        }
                    }
                });
    }
}
