package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {
    private static FragmentBlankBinding binding;
    public BlankFragment() {

    }


    @Override
    public void onStart() {
        Log.d("abc", "onStart frag 1 ");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("abc", "onResume frag 1 ");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("abc", "onPause frag 1 ");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("abc", "onStop frag 1 ");
        super.onStop();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("abc", "onAttach frag 1 ");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("abc", "onCreate frag 1 ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        Log.d("abc", "onDestroyView frag 1: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("abc", "onDestroy frag 1 ");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("abc", "onDetach frag 1 ");
        super.onDetach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false);
        Log.d("abc", "onCreateView: ");
        return binding.getRoot();
    }




}