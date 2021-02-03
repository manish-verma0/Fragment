package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.example.fragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private BlankFragment fragment;
    private BlankFragment2 fragment2;
    private  BlankFragment3 fragment3;
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        fragment=new BlankFragment();
        fragment2=new BlankFragment2();
        fragment3=new BlankFragment3();

        activityMainBinding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fragment.isAdded()){
                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                }
                getSupportFragmentManager().beginTransaction().add(R.id.frame,fragment).addToBackStack(null).commit();
            }
        });
        activityMainBinding.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fragment2.isAdded()){
                    getSupportFragmentManager().beginTransaction().remove(fragment2).commit();
                }
                getSupportFragmentManager().beginTransaction().add(R.id.frame,fragment2).addToBackStack(null).commit();
            }
        });
        activityMainBinding.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fragment3.isAdded()){
                    getSupportFragmentManager().beginTransaction().remove(fragment3).commit();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment3).addToBackStack(null).commit();
            }
        });
    }



}