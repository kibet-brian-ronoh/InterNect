package com.example.internect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mtoggle;
    private Toolbar toolbar;
    AlertDialog.Builder builder;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerl);
        mtoggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close);
        drawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view) ;
        //navigationView.setNavigationItemSelectedListener(NavigationDrawer.this);

        btn = (Button) findViewById(R.id.attendpl);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder = new AlertDialog.Builder(NavigationDrawer.this);
                builder.setMessage("See You Then");
                builder.setTitle("Successful!");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mtoggle.onOptionsItemSelected(item)){
            int id = item.getItemId();
            switch (id) {
                case R.id.myclubs:
                    startActivity(new Intent(NavigationDrawer.this, MyClubs.class));
                    return true;
                case R.id.clubs:
                    startActivity(new Intent(NavigationDrawer.this, Clubs.class));
                    return true;
                case R.id.events:
                    startActivity(new Intent(NavigationDrawer.this, LogIn.class));
                    return true;
                case R.id.aboutus:
                    startActivity(new Intent(NavigationDrawer.this, AboutUs.class));
                    return true;
                case R.id.logout:
                    startActivity(new Intent(NavigationDrawer.this, NavigationDrawer.class));
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
    }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.myclubs){
            startActivity(new Intent(NavigationDrawer.this, MyClubs.class));
        }
        else if (id == R.id.clubs){
            startActivity(new Intent(NavigationDrawer.this, Clubs.class));
        }
        else if (id == R.id.events){
            startActivity(new Intent(NavigationDrawer.this, LogIn.class));
        }
        else if (id == R.id.aboutus){
            startActivity(new Intent(NavigationDrawer.this, AboutUs.class));
        }
        else if (id == R.id.logout){
            startActivity(new Intent(NavigationDrawer.this, LogIn.class));
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
