package com.example.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment3 extends Fragment {



    public BlankFragment3() {

    }
    @Override
    public void onStart() {
        Log.d("abc", "onStart frag 3 ");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("abc", "onResume frag 3 ");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("abc", "onPause frag 3 ");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("abc", "onStop frag 3 ");
        super.onStop();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("abc", "onAttach frag 3 ");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("abc", "onCreate frag 3 ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        Log.d("abc", "onDestroyView frag 3: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("abc", "onDestroy frag 3");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("abc", "onDetach frag 3 ");
        super.onDetach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("abc", "onCreateView frag 3 ");
        return inflater.inflate(R.layout.fragment_blank3, container, false);
    }
}