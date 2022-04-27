package com.example.notificationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "com.mirea.asd.notification.ANDROID";
    private int IDENTIFICATE_MSG = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewMessageNotification(View view){

        Intent notificationIntent = new Intent(MainActivity.this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(MainActivity.this,
                0, notificationIntent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle("Мирэа")
                        .setContentText("Пора снова поработать над приложением")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setContentIntent(contentIntent);

        NotificationManagerCompat notificationManager =
                NotificationManagerCompat.from(MainActivity.this);
        notificationManager.notify(IDENTIFICATE_MSG, builder.build());
    }
}