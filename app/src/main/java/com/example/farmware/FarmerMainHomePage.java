package com.example.farmware;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.farmware.f_home;
import com.example.farmware.f_profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class FarmerMainHomePage extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_main_homepage);


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation1);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        fragment = new f_home();
                        break;
                    case R.id.nav_profile:
                        fragment = new f_profile();
                        break;

                }


                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                }
                return true;
            }
        });
    }
}