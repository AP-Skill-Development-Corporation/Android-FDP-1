package com.example.inputcontrols_fdp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radiob1,radiob2;
    CheckBox checkb1,checkb2,checkb3;
    Button but1;
    Switch aSwitch;
    LinearLayout linearLayout;
    ProgressBar progressBar;
    Handler handler;
    int progress =0;
    TextView pText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pText1 = findViewById(R.id.ptext1);
        linearLayout = findViewById(R.id.linear1);
        progressBar = findViewById(R.id.progress1);
        radioGroup  = findViewById(R.id.rg1);
        aSwitch = findViewById(R.id.switch1);
        radiob1 = findViewById(R.id.rb1);
        radiob2 = findViewById(R.id.rb2);
        checkb1 = findViewById(R.id.cb1);
        checkb2 = findViewById(R.id.cb2);
        checkb3 = findViewById(R.id.cb3);
        but1 = findViewById(R.id.save1);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aSwitch.isChecked()){
                    linearLayout.setBackgroundColor(Color.YELLOW);
                }
                else {
                    linearLayout.setBackgroundColor(Color.BLUE);
                }
            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkb1.isChecked() && checkb2.isChecked() && checkb3.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb1.getText()+
                            ","+checkb2.getText()+","+checkb3.getText(), Toast.LENGTH_SHORT).show();
                }
                else if(checkb1.isChecked() && checkb2.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb1.getText()+","+checkb2.getText(), Toast.LENGTH_SHORT).show();
                }
                else if (checkb2.isChecked() && checkb3.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb2.getText()+","+checkb3.getText(), Toast.LENGTH_SHORT).show();

                }
                else if (checkb3.isChecked() && checkb1.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb3.getText()+","+checkb1.getText(), Toast.LENGTH_SHORT).show();

                }
                else if (checkb1.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb1.getText(), Toast.LENGTH_SHORT).show();

                }
                else if (checkb2.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb2.getText(), Toast.LENGTH_SHORT).show();

                }
                else if (checkb3.isChecked()){
                    Toast.makeText(MainActivity.this, ""+checkb3.getText(), Toast.LENGTH_SHORT).show();

                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "You Selected Male", Toast.LENGTH_SHORT).show();
                         break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "You Selected Female", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }

    public void submit(View view) {
        Toast.makeText(this, "Your Selected Image", Toast.LENGTH_SHORT).show();
    }

    public void click(View view) {
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(progressBar.getProgress()<100){
                    progressBar.setProgress(progress);
                    progress++;
                    handler.postDelayed(this,100);
                    pText1.setText("Wait.....");

                }
                else{
                    pText1.setText("Finished");
                }

            }
        },100);

    }
}
