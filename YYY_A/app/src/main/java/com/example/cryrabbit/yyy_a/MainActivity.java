package com.example.cryrabbit.yyy_a;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.cryrabbit.yyy_a.Fragment.MainFragment1;
import com.example.cryrabbit.yyy_a.Fragment.MainFragment2;
import com.example.cryrabbit.yyy_a.Fragment.MainFragment3;
import com.example.cryrabbit.yyy_a.Fragment.MainFragment4;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener{
    @ViewInject(R.id.main_text_frist)
    TextView textView1;
    @ViewInject(R.id.main_text_heihei)
    TextView textView2;
    @ViewInject(R.id.main_text_miaomiao)
    TextView textView3;
    @ViewInject(R.id.main_text_mine)
    TextView textView4;
    @ViewInject(R.id.vaper)
    ViewPager viewPager;
    private MyFragmentAdapter myFragmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewUtils.inject(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView =(NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        myFragmentAdapter=new MyFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentAdapter);
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                textView1.setSelected(false);
                textView2.setSelected(false);
                textView3.setSelected(false);
                textView4.setSelected(false);
                switch (viewPager.getCurrentItem()){
                    case 0:
                        textView1.setSelected(true);
                        break;
                    case 1:
                        textView2.setSelected(true);
                        break;
                    case 2:
                        textView3.setSelected(true);
                        break;
                    case 3:
                        textView4.setSelected(true);
                        break;
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @OnClick(value={R.id.main_text_mine,R.id.main_text_miaomiao,R.id.main_text_heihei,R.id.main_text_frist})
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_text_frist:
                viewPager.setCurrentItem(0);
                break;
            case R.id.main_text_heihei:
                viewPager.setCurrentItem(1);
                break;
            case R.id.main_text_miaomiao:
                viewPager.setCurrentItem(2);
                break;
            case R.id.main_text_mine:
                viewPager.setCurrentItem(3);
                break;
        }
    }
}
