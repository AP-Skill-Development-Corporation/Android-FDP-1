package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //R.Java
    //1.enable the developer options in the device
    //Seettings >> about Phone>> BuildNumber(7 times continues)
    // >> one message you have a develeoper options

    //In the developer options we have to enable three things
    // 1. OEM Unlock, 2.USB debugging.3.Verify Apps Over uSB(Install apps Via USB)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
