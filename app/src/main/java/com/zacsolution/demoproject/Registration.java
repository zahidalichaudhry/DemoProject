package com.zacsolution.demoproject;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
TextView title;
    ScrollView scrollView;
    Button next;
    ConstraintLayout user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        scrollView=(ScrollView)findViewById(R.id.scrollView);
        title=(TextView)findViewById(R.id.title);
        title.setText("Daftars");
        next=(Button)findViewById(R.id.next);
        next.setEnabled(false);
        next.setBackgroundColor(ContextCompat.getColor(this, R.color.greyshade));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this,Registration_2.class);
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
                            next.setBackgroundColor(ContextCompat.getColor(Registration.this,R.color.orige));
                        } else {
                            //scroll view is not at bottom
                        }
                    }
                });
    }
}
