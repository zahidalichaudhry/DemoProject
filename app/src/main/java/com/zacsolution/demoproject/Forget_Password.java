package com.zacsolution.demoproject;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zacsolution.demoproject.Fragments.Contactus;
import com.zacsolution.demoproject.Fragments.men;
import com.zacsolution.demoproject.Fragments.password_last;
import com.zacsolution.demoproject.Fragments.password_one;
import com.zacsolution.demoproject.Fragments.password_three;
import com.zacsolution.demoproject.Fragments.password_two;
import com.zacsolution.demoproject.Fragments.women;

import java.util.ArrayList;
import java.util.List;

public class Forget_Password extends AppCompatActivity {
//    private TabLayout tabLayout;
//    private ViewPager viewPager;
Button btn_next;
EditText eduser,edpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password);
        eduser=(EditText)findViewById(R.id.user);
        edpass=(EditText)findViewById(R.id.pass);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forget_Password.this,Login_Activity.class);
                startActivity(intent);
            }
        });

        btn_next=(Button)findViewById(R.id.next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eduser.getText().toString().length()==0||edpass.getText().toString().length()==0)
                {
                    ChoseOption() ;
                }else
                    {
                        Intent intent = new Intent(Forget_Password.this,Forget_password_2.class);
                        startActivity(intent);

                    }
            }
        });

//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);

    }
    private void ChoseOption()
    {
        final AlertDialog.Builder builder = new AlertDialog.Builder(Forget_Password.this);
        LayoutInflater inflater = Forget_Password.this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.wrong_keys, null);
        builder.setView(dialogView);
        Button home;
        home=(Button)dialogView.findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forget_Password.this,Forget_Password.class);
                startActivity(intent);
            }
        });


        builder.setCancelable(false);

        builder.show();
    }

    private void setupViewPager(ViewPager viewPager) {
        Forget_Password.ViewPagerAdapter adapter = new Forget_Password.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new password_one(), "COLORED");
        adapter.addFragment(new password_two(), "PRESCRIPTION");
        adapter.addFragment(new password_three(), "ACCESSORIES");
//        adapter.addFragment(new password_last(), "kuchbhi");
//        adapter.addFragment(new Photographers(), "Photographers");
//        adapter.addFragment(new Designers(), "Designers");
//        adapter.addFragment(new Users(), "Users");
//        adapter.addFragment(new ModelShoot(), "Model Shoot");
//        adapter.addFragment(new Marriage(), "Marriage");
//        adapter.addFragment(new Party(), "Party");
//        adapter.addFragment(new Queries(), "Queries");
        viewPager.setAdapter(adapter);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}