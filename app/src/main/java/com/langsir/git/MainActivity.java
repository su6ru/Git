package com.langsir.git;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int h=0;
    int version=4;
    String s="service";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h=1;
        h=3;
        int g=6;
        String Master="Master";
        System.out.println(Master);
        System.out.println(g);
        Log.d("branch","Master");
    }
}
