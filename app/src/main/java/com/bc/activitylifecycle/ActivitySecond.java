package com.bc.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity{
    private TextView mTextView;
    private Button mSendBackButton;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String inforContent = getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHYSICAL);
        //Toast.makeText(ActivitySecond.this, inforContent, Toast.LENGTH_SHORT).show();
        mTextView = (TextView) findViewById(R.id.second_activity_text_view);

        mTextView.setText(inforContent);

        mNameEditText = (EditText) findViewById(R.id.second_activity_edit_view);
        mSendBackButton = (Button) findViewById(R.id.second_activity_button);
        mSendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("back", name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });




    }
}
