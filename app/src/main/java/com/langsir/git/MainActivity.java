package com.langsir.git;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int h=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h=1;
        h=3;
        int g=6;
        String Master="1";
        System.out.println(Master);
        System.out.println(g);
    }
}
