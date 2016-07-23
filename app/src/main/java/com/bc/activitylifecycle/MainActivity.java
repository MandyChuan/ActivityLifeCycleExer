package com.bc.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static final String BOOK_NAME_OF_CATEGORY_PHYSICAL = "bookNameOfCategoryPhysical";
    private Button mButton;
    private Button mThirdButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 执行了");
        mButton = (Button) findViewById(R.id.activity_main_button);
        final EditText editText = (EditText) findViewById(R.id.activity_main_edit_text);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,ActivitySecond.class);
//                startActivity(intent);
//               Toast.makeText(MainActivity.this, "Button被点击了！", Toast.LENGTH_SHORT).show();
//                Intent intent  = new Intent(MainActivity.this,ActivitySecond.class);
//                intent.putExtra(BOOK_NAME_OF_CATEGORY_PHYSICAL,editText.getText().toString());
//                startActivity(intent);

                Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
                intent.putExtra(BOOK_NAME_OF_CATEGORY_PHYSICAL,editText.getText().toString());
                startActivityForResult(intent,0);
            }
        });

        mThirdButton = (Button) findViewById(R.id.activity_main_third_button);
        mThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        String returnData = data.getStringExtra("back");
        Toast.makeText(MainActivity.this, returnData, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 执行了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 执行了 ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 执行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 执行了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 执行了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: 执行了");
    }
}
