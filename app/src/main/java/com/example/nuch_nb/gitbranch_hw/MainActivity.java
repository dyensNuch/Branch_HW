package com.example.nuch_nb.gitbranch_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mVersion = "Version1.0"; //from master git;
    }

    public void methodfromGitDev(){
        int mDev = 99;
    }

}
