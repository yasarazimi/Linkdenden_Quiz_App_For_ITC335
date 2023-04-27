package com.example.linkdendenquizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottonnav;

    Homefragment homefragment = new Homefragment();
    Jobsfragment jobsfragment = new Jobsfragment();
    Notificationsfragment notificationsfragment = new Notificationsfragment();
    NetworkFragment networkfragment = new NetworkFragment();
    PostFragment postFragment = new PostFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottonnav = findViewById(R.id.bottonnav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefragment).commit();

        bottonnav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefragment).commit();
                        return true;
                    case R.id.jobs:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,jobsfragment).commit();
                        return true;
                    case R.id.notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,notificationsfragment).commit();
                        return true;
                    case R.id.network:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,networkfragment).commit();
                        return true;
                    case R.id.Post:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,postFragment).commit();

                        return true;
                }
                return false;
            }
        });

    }
}