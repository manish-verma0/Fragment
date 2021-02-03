package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.databinding.FragmentBlank2Binding;


public class BlankFragment2 extends Fragment {

    private static FragmentBlank2Binding fragmentBlank2Binding;
    public BlankFragment2() {
        // Required empty public constructor
    }
    @Override
    public void onStart() {
        Log.d("abc", "onStart frag 2 ");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("abc", "onResume frag 2 ");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("abc", "onPause frag 2 ");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("abc", "onStop frag 2 ");
        super.onStop();
    }


    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("abc", "onAttach frag 2 ");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("abc", "onCreate frag 2 ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        Log.d("abc", "onDestroyView frag 2: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("abc", "onDestroy frag 2 ");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("abc", "onDetach frag 2 ");
        super.onDetach();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentBlank2Binding= DataBindingUtil.inflate(inflater,R.layout.fragment_blank2,container,false);
        Log.d("abc", "onCreateView frag 2 ");
        return fragmentBlank2Binding.getRoot();
    }


}