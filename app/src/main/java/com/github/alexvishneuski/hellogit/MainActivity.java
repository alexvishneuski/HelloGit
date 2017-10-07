package com.github.alexvishneuski.hellogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Some changes in branch develop
        //First feature improvement
        //Second feature improvement: сonflict before merge is simulated in this line
        //Some changes in branch develop
        //Added formal changes in branch release-1.0
    }
}
