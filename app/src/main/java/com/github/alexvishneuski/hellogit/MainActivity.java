package com.github.alexvishneuski.hellogit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Commit #1 in an yet separate branch before rebase
        //Commit #2 in develop branch before rebase
        }
}
