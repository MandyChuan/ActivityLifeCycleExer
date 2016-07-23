package com.bc.activitylifecycle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String inforContent = getIntent().getStringExtra("name");
        Toast.makeText(ActivitySecond.this, inforContent, Toast.LENGTH_SHORT).show();
    }
}
