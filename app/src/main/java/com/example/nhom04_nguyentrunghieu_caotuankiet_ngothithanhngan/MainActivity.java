package com.example.nhom04_nguyentrunghieu_caotuankiet_ngothithanhngan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
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
//        drawer = findViewById(R.id.drawerLayout);


// bottom navigation


        display(R.id.mnuHome);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
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
            case R.id.mnuList:
                toolbar.setTitle("List");
                fragment = new SettingFragment();
//                fragment = new CategoriesFragment();
                break;
            case R.id.mnuNote:
                toolbar.setTitle("Vocabulary");
                fragment = new ProfileFragment();
                break;
//            case R.id.mnuTranslate:
//                toolbar.setTitle("Dictionary");
//                fragment = new TranslateFragment();
//                break;

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