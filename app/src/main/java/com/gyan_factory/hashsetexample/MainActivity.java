package com.gyan_factory.hashsetexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // duplicate value added for filter
        Set<ModelData> data = new HashSet<>();
        data.add(new ModelData(0,"a"));
        data.add(new ModelData(0,"a"));
        data.add(new ModelData(0,"b"));
        data.add(new ModelData(0,"a"));
        data.add(new ModelData(0,"c"));
        data.add(new ModelData(0,"d"));
        data.add(new ModelData(0,"e"));
        data.add(new ModelData(0,"f"));

        printData(data);

    }

    //print the result without duplications
    private void printData(Set<ModelData> data) {
        for (ModelData modelData : data) {
            Log.i(TAG,"Id "+modelData.getId()+",Name: "+modelData.getName());
        }
    }
}
