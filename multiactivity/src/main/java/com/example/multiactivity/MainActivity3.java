package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = (TextView) findViewById(R.id.textView);

        Bundle arguments = getIntent().getExtras();
        String text = arguments.getString("key").toString();

        textView.setText(text);
    }
}