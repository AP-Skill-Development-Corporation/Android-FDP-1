package com.muneiah.navigationcomponenttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
       //Inisilizings the views connect with id's
        Button red_Button=v.findViewById(R.id.redBtn);
        Button green_Buttion=v.findViewById(R.id.greenBtn);
        Button white_Buttion=v.findViewById(R.id.whiteBtn);
        //Event handilings
        red_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_redFragment);
            }
        });
        green_Buttion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_greenFragment);
            }
        });
        white_Buttion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_whiteFragment);
            }
        });

        return  v;
    }
}
