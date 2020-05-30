package in.apssdc.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {
EditText email,name;
TextView tv;
StudentDataBase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.et_email);
        name=findViewById(R.id.et_name);
        tv=findViewById(R.id.textView);
        db= Room.databaseBuilder(this,StudentDataBase.class,"sdb")
                .allowMainThreadQueries()
                .build();
    }

    public void save(View view) {
        String semail=email.getText().toString();
        String sname=name.getText().toString();
        StudentEnity sEntity=new StudentEnity(semail,sname);
        db.studentDAO().insetData(sEntity);
        Toast.makeText(this, "Inset", Toast.LENGTH_SHORT).show();
        getData();

    }

    private void getData() {
        List<StudentEnity> studentEnities=db.studentDAO().getAll();
        for (int i=0;i<studentEnities.size();i++){
            tv.append(""+studentEnities.get(i).getId());
            tv.append(" "+studentEnities.get(i).getEmail());
            tv.append("  "+studentEnities.get(i).getName());
            tv.append("\n");
        }

    }
}