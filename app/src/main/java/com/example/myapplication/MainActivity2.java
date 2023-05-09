package com.example.myapplication;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity2 extends Activity {
    TextView j;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent secondActivity = getIntent();
        j = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("same");
        j.setText(result);

    }
}
