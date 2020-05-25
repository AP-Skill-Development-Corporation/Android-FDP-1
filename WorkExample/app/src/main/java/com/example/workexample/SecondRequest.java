package com.example.workexample;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SecondRequest extends Worker {
    NotificationManager manager;
    public SecondRequest(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        manager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        createNotification();
        sendNotification();
        return Result.success();
    }

    private void createNotification() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("APSSDC","Notification",
                    NotificationManager.IMPORTANCE_HIGH);
            channel.enableVibration(true);
            channel.enableLights(true);
            channel.setLightColor(Color.GRAY);
            manager.createNotificationChannel(channel);
        }
    }
    private void sendNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),
                "APSSDC");
        builder.setContentTitle("Notification");
        builder.setContentText("This is my notification");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        manager.notify(0,builder.build());

    }
}
