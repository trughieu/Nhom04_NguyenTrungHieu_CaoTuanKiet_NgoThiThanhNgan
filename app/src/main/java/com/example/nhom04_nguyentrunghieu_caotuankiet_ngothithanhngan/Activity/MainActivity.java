package com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan.Fragment.HomeFragment;
import com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan.Fragment.ProfileFragment;
import com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan.R;
import com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan.Fragment.SettingFragment;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    BottomAppBar bottomAppBar;
//
//    NavController navController;
//    AppBarConfiguration appBarConfiguration;
//    NavigationView navigationView;
//    DrawerLayout drawer;
//    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);
//        drawer = findViewById(R.id.drawerLayout);


// bottom navigation


        display(R.id.mnuHome);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                display(item.getItemId());
                return true;
            }
        });
    }

    //
//    // hiển thị fragment
    void display(int id) {
        Fragment fragment = null;
        switch (id) {
            case R.id.mnuHome:
                toolbar.setTitle("Home");
                fragment = new HomeFragment();
                break;
            case R.id.mnuFriend:
                toolbar.setTitle("List");
                fragment = new SettingFragment();
//                fragment = new CategoriesFragment();
                break;
            case R.id.mnuNote:
                toolbar.setTitle("Vocabulary");
                fragment = new ProfileFragment();
                break;
            case R.id.mnuProfile:
                toolbar.setTitle("Dictionary");
                fragment = new ProfileFragment();
                break;

        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content, fragment);
        ft.commit();

//
//        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,
//                drawer,
//                toolbar,
//                R.string.open,
//                R.string.close);
//
//        drawer.addDrawerListener(actionBarDrawerToggle);
//
//        appBarConfiguration = new AppBarConfiguration.Builder(R.id.settingFragment, R.id.navJetBackProfileFragment)
//                .setDrawerLayout(drawer)
//                .build();
//        navController = Navigation.findNavController(this, R.id.content_nav);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
//
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//
//    @Override
//    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        actionBarDrawerToggle.syncState();
//    }

    }
}