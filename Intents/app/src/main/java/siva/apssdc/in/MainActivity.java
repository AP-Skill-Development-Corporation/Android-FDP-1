package siva.apssdc.in;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button bt;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.next_button);
        editText=findViewById(R.id.edit_text);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                Intent i=new Intent(MainActivity.this,
                        Main2Activity.class);
                i.putExtra("android",s);
                startActivity(i);
            }
        });
    }
}
