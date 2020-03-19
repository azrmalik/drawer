package com.example.draw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    NavigationView objectNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objectNavigationView = findViewById(R.id.navigationView);

        objectNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.item_home)
                {
                    Toast.makeText(MainActivity.this, "HOME ITEM CLICKED", Toast.LENGTH_LONG).show();
                    return true;

                }else if(item.getItemId() == R.id.item_search)
                {
                    Toast.makeText(MainActivity.this, "SEARCH ITEM CLICKED", Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
    }
}
