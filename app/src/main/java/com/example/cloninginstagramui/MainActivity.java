    package com.example.cloninginstagramui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navbarbttm;

    public static String FRAGMENT = "fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setContentView(R.layout.activity_main);
        navbarbttm = findViewById(R.id.bottomNav);
        navbarbttm.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                if(item.getItemId() == R.id.Beranda){
                    selectedFragment = null;
                }else if (item.getItemId() == R.id.Pencarian){
                    selectedFragment = null;
                }else if (item.getItemId() == R.id.Upload){
                    selectedFragment = null;
                }else if (item.getItemId() == R.id.Reels){
                    selectedFragment = null;
                }else if (item.getItemId() == R.id.Profil){
                    selectedFragment = new FragmentProfil();
                }

                if(selectedFragment != null){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_layout, selectedFragment)
                            .commit();
                }
                return true;
            }
        });
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new FragmentProfil())
                .commit();
    }
}