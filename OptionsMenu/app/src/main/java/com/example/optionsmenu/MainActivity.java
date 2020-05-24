package com.example.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void popup(View view) {

        PopupMenu popup = new PopupMenu(MainActivity.this,);
        popup.getMenuInflater().inflate(
                R.menu.popup, popup.getMenu());
        popup.setOnMenuItemClickListener(
                new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return false;
                    }
                    // implement click listener
                });
        popup.show();


    }
}
