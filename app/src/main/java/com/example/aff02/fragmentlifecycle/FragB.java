package com.example.aff02.fragmentlifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AFF02 on 09-Aug-17.
 */

public class FragB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_b,container,false);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(">>>","Frag B onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(">>>","Frag B onCreate");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(">>>","Frag B onViewCreated");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(">>>","Frag B onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(">>>","Frag B onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(">>>","Frag B onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(">>>","Frag B onResume");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(">>>","Frag B onDetach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(">>>","Frag B onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(">>>","Frag B onDestroyView");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(">>>","Frag B onPause");
    }
}
