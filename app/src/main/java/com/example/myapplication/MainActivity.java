package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button c;
    EditText cj1;
    EditText cj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = (Button) findViewById(R.id.button_check);
        cj1 = (EditText) findViewById(R.id.first_string_edit_text);
        cj2 = (EditText) findViewById(R.id.second_string_edit_text);
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String fir = cj1.getText().toString();
                String sec = cj2.getText().toString();
                if (fir.equalsIgnoreCase(sec)) {
                    i.putExtra("same", "THE SAME");
                    startActivity(i);

                } else {
                    i.putExtra("same", "NOT THE SAME");
                    startActivity(i);
                }
            }
        });
    }
    public void onSwap (View view){
        cj1 = (EditText) findViewById(R.id.first_string_edit_text);
        cj2 = (EditText) findViewById(R.id.second_string_edit_text);
        String getFirstString = String.valueOf(cj1.getText());
        String getSecondString = String.valueOf(cj2.getText());
        cj1.setText(getSecondString);
        cj2.setText(getFirstString);
    }
}
