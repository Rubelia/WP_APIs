package com.example.ttv_magento_thang.wpapi;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // if the screen is in landscape mode, we can show the
            // dialog in-line with the list so we don't need this activity.
            finish();
            return;
        }

        if (savedInstanceState == null) {
            TestFragment trendsFragment = new TestFragment();
//            getFragmentManager().beginTransaction().add(android.R.id.content, trendsFragment).commit();
        }
    setContentView(R.layout.activity_main);
    }
}
