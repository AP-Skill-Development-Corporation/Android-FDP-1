package com.muneiah.mytabnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
//Inisilizing the views
    TabLayout tab;
ViewPager viewPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connecting the id's
        tab=findViewById(R.id.mytabLayout);
        viewPage=findViewById(R.id.myviewPager);
        viewPage.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(viewPage);
       tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               Toast.makeText(MainActivity.this, "Selected : "+tab.getText().toString(), Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {
               Toast.makeText(MainActivity.this, "Un-Selected : "+tab.getText().toString(), Toast.LENGTH_SHORT).show();

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {
               Toast.makeText(MainActivity.this, "Re-Selected : "+tab.getText().toString(), Toast.LENGTH_SHORT).show();

           }
       });
    }
    //For Create a fragment Pager adapter class
    public class MyPagerAdapter extends FragmentPagerAdapter
    {
        //For giving tabs titles creating string array
        String titles[]={"Chats","Status","Calls"};

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position==0){
                return new ChatsFragment();
            }
            if (position==1){
                return new StatusFragment();
            }
            if (position==2){
                return new CallsFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return titles.length;
        }
        //Import the default override getpagetitle()

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}

