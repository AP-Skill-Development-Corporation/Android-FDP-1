package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text1);
    }



    public void showToast1(View view) {
       // Toast.makeText(this,"Welcome HelloWorld",Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, "Hai", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "hai", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
        count++;
        tv.setText(" "+count);

    }

}
