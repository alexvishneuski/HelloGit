package com.github.alexvishneuski.hellogit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate is called");
        //Some changes in branch develop
        //First feature improvement
        //Second feature improvement: сonflict before merge is simulated in this line
        //Some changes in branch develop
        //Added formal changes in branch release-1.0
        //Added feature to branch feature_third_feature









        //Added some changes to show "CheryPick!!!"
        //Added feature to branch feature_third_feature









        //Added some changes to show "CheryPick!!!"

        //Hidden changes after stashing - unStashing
    }
}
