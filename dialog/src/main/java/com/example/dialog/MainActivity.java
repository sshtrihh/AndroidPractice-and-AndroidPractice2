package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view){
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Ок\"!",
                Toast.LENGTH_LONG).show();

    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Отмена\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickTimePickerDialog(View view){
        DialogFragment timePicker = new MyTimeDialogFragment();
        timePicker.show(getSupportFragmentManager(), "timePicker");
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
        TextView textView = (TextView) findViewById(R.id.timeText);
        textView.setText("Hour: "+ hourOfDay + " Minute: " + minute);
    }

    public void onClickDatePickerDialog(View view){
        DialogFragment timePicker = new MyDateDialogFragment();
        timePicker.show(getSupportFragmentManager(), "datePicker");
    }
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, day);
        String currentDateString = DateFormat.getDateInstance().format(c.getTime());
        TextView textView = (TextView) findViewById(R.id.dateText);
        textView.setText(currentDateString);
    }

    public void onClickProgressDialog(View view){
        DialogFragment progressPicker = new MyProgressDialogFragment();
        progressPicker.show(getSupportFragmentManager(), "progressPicker");
    }


}