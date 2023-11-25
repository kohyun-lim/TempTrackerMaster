package com.example.weatherinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoriteActivity extends AppCompatActivity {
    BottomNavigationView naviagtion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        naviagtion = findViewById(R.id.NavigationView);
        naviagtion.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent intentHome = new Intent(FavoriteActivity.this, HomeActivity.class);
                        startActivity(intentHome);
                        finish();
                        return true;
                    case R.id.action_search:
                        Intent intentSearch = new Intent(FavoriteActivity.this, MainActivity.class);
                        startActivity(intentSearch);
                        finish();
                        return true;
                    case R.id.action_favorite:
                        return true;
                    default:
                        return true;
                }
            }
        });
    }
}