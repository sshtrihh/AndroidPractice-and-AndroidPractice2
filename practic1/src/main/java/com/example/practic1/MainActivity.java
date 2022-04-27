package com.example.practic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button_Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    /*
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New information about MIREA");

        Button button = findViewById(R.id.button20);
        button.setText("MIREA button");

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);

     */
        textView = (TextView) findViewById(R.id.textView4);
        button_Ok = findViewById(R.id.button21);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка 'ОК'");
            }

        };


        button_Ok.setOnClickListener(onClickListener);

    }
    public void on_button_cancel_click(View view)
    {
        textView.setText("Нажата кнопка 'Cancel'");
    }
}