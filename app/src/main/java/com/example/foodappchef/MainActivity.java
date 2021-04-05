package com.example.foodappchef;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodappchef.Fragments.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Initialize variables here
//        Custom Toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        BottomNavigation
        bottomNavigation = findViewById(R.id.bottom_nav);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        Toast.makeText(MainActivity.this, "Bottom Nav home selected", Toast.LENGTH_SHORT).show();
                        //      getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
                        return true;
                    case R.id.cart_view:
                        Toast.makeText(MainActivity.this, "Bottom Nav cart_view selected", Toast.LENGTH_SHORT).show();
                        return true;
//                    case R.id.account:
//                        Toast.makeText(MainActivity.this, "Bottom Nav account selected", Toast.LENGTH_SHORT).show();
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentUserProfile()).commit();
//                        return true;
                }
                return true;
            }
        });

//
////        Navigation Drawer View in main activity
//        NavigationView navigationView = findViewById(R.id.nav_view);
//
////       Navigation Drawer Layout in menu
//        drawerLayout = findViewById(R.id.drawer_layout);
//
////        Navigation Drawer item click event
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////               function call to public boolean itemSelected(MenuItem item) to get selected item
//                return true;
//            }
//        });
//        Navigation Drawer: open close
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//
////            selected fragment will be highlighted
//        navigationView.setCheckedItem(R.id.side_nav_home);
//    }

        //    Navigation Drawer: add functionality on navigation drawer item click..
//    public boolean itemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.side_nav_home:
//                Toast.makeText(MainActivity.this, "side_nav_home selected", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
//                break;
//            case R.id.side_nav_about:
//                Toast.makeText(MainActivity.this, "side_nav_about selected", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
//                break;
//            case R.id.side_nav_favourite:
//                Toast.makeText(MainActivity.this, "side_nav_favouriteselected", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
//                break;
//            case R.id.side_nav_payments:
//                Toast.makeText(MainActivity.this, "side_nav_payments selected", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
//                break;
//
//            case R.id.side_nav_setting:
////                rendering selected fragment based on Navigation drawer menu item's id
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
//                break;
//            case R.id.side_nav_notifications:
//                Toast.makeText(MainActivity.this, "side_nav_notifications selected", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fragment()).commit();
//                break;
//            case R.id.side_nav_share:
//                ShareCompat.IntentBuilder.from(MainActivity.this)
//                        .setType("text/plain")
//                        .setChooserTitle("News Reader")
//                        .setText("code for News Reader app is available at https://github.com/neerajp67/News-Reader\nstay connected  with us on https://github.com/neerajp67/ for more exiting projects.. ")
//                        .startChooser();
//                break;
//        }
//        drawerLayout.closeDrawer(GravityCompat.START);
//        return true;
//    }

    }
}


