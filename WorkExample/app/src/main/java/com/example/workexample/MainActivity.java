package com.example.workexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    OneTimeWorkRequest first;
    PeriodicWorkRequest second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = new OneTimeWorkRequest.Builder(FirstRequest.class).build();
        second = new PeriodicWorkRequest.Builder(SecondRequest.class,15, TimeUnit.MINUTES).build();
    }

    public void trigger(View view) {
        WorkManager.getInstance(this).enqueue(first);
        WorkManager.getInstance(this).enqueue(second);
    }
}
