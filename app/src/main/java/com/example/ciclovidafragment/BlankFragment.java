package com.example.ciclovidafragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context); // Acá podemos hacer una referencia a un activity, de modo que podemos usar en diferentes activitys
        Log.i("CICLOVIDA","Fragment onAttach");

        Toast.makeText(getActivity(),"mensaje de actvidad okokookokkkkk", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("CICLOVIDA","Fragment onCreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}