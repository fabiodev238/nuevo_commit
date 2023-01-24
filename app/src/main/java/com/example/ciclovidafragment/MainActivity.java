package com.example.ciclovidafragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CICLOVIDA", "Activity onCreate");

        Toast.makeText(this, "mensaje de actvidad", Toast.LENGTH_SHORT).show();

        // los activitys si crean un context de memoria, los fragmentos no crean contextos de memoria.
        // los activitys si crean un context de memoria, los fragmentos no crean contextos de memoria.
    }
}