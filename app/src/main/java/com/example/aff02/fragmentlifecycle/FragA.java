package com.example.aff02.fragmentlifecycle;

import android.app.Activity;
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

public class FragA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a,container,false);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(">>>","Frag A onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(">>>","Frag A onCreate");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(">>>","Frag A onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(">>>","Frag A onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(">>>","Frag A onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(">>>","Frag A onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(">>>","Frag A onResume");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(">>>","Frag A onDetach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(">>>","Frag A onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(">>>","Frag A onDestroyView");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(">>>","Frag A onPause");
    }
}
