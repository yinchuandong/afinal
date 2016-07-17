package org.unimelb.afinal;

import android.os.Bundle;

import net.tsz.afinal.FinalActivity;

public class MainActivity extends FinalActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init(){
    }
}
