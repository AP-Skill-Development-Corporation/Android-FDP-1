package in.apssdc.shardprefernces_database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText name,email,password;
 SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et_name);
        email=findViewById(R.id.et_email);
        password=findViewById(R.id.et_passwrod);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);

    }

    public void register(View view) {
        String u_name=name.getText().toString();
        String u_password=password.getText().toString();
        SharedPreferences.Editor editor=preferences.edit(); // on the editor mode
        if (u_name.equals("")){
            Toast.makeText(this, "please enter uaser naem", Toast.LENGTH_SHORT).show();
        } else if (u_password.equals("")){
            Toast.makeText(this, "Please enter Valid passdword", Toast.LENGTH_SHORT).show();
        }else {
            editor.putString("name", u_name);
            editor.putString("password", u_password);
            editor.apply();
            Toast.makeText(this, "User Registed sucessfull ", Toast.LENGTH_SHORT).show();// feed back
            Intent i = new Intent(MainActivity.this, Login_Activity.class); // moving for login activity
            startActivity(i);
        }



    }

    public void login(View view) {
        Intent i=new Intent(MainActivity.this,Login_Activity.class);
        startActivity(i);

    }
}
