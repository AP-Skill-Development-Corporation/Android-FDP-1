package siva.apssdc.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.edit_text);
    }

    public void dail(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        String num =text.getText().toString();
        i.setData(Uri.parse("tel:"+num));// tel:9988776655
        startActivity(i);
    }

    public void sharetext(View view) {
        String txt =text.getText().toString();
        ShareCompat.IntentBuilder.from(this).setType("text/plain")
                .setChooserTitle("Choose the one one of the apps")
                .setText(txt)
                .startChooser();
    }

    public void whatsapp(View view) {
        Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(i);

    }
}
