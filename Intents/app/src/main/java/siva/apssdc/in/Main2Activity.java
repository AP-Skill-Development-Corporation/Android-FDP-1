package siva.apssdc.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text=findViewById(R.id.text_view);
        String s=getIntent().getStringExtra("android");
        text.setText(s);
    }
}
