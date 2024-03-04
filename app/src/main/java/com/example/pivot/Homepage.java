package com.example.pivot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.pivot.fragment.AccountFragment;
import com.example.pivot.fragment.AddFragment;
import com.example.pivot.fragment.BlogFragment;
import com.example.pivot.fragment.CreditCardFragment;
import com.example.pivot.fragment.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Homepage extends AppCompatActivity {

    BottomNavigationView navigationView;

    ViewPager viewPager;

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        navigationView = findViewById(R.id.bottomNavigationView);

//        viewPager = findViewById(R.id.viewPager);
        frameLayout = findViewById(R.id.content);
        loadHomeFragment();

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                frameLayout.setVisibility(View.VISIBLE);
//                viewPager.setVisibility(View.VISIBLE);
                int itemId = item.getItemId();
                if (itemId == R.id.home) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new HomeFragment()).commit();
                    return true;
                } else if (itemId == R.id.add) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new AddFragment()).commit();
                    return true;

                }
                else if (itemId == R.id.blogs) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new BlogFragment()).commit();
                    return true;
                }
                else if (itemId == R.id.account) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new AccountFragment()).commit();
                    return true;
                }
                else if (itemId == R.id.credit_card) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new CreditCardFragment()).commit();
                    return true;
                }
                return false;
            }
        });
    }

    private void loadHomeFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content, new HomeFragment()) // Replace with your actual HomeFragment class
                .commit();
    }
}