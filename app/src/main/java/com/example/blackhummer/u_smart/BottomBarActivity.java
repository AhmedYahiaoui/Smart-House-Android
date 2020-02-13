package com.example.blackhummer.u_smart;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import android.animation.ArgbEvaluator;
import java.util.ArrayList;
import java.util.List;

import com.example.blackhummer.u_smart.fragment.ControlFragment;
import com.example.blackhummer.u_smart.fragment.HomeFragment;
import com.example.blackhummer.u_smart.fragment.ProfileFragment;
import com.example.blackhummer.u_smart.fragment.acquisitionFragment;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.BubbleToggleView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;

import java.util.ArrayList;
import java.util.List;

public class BottomBarActivity extends AppCompatActivity {


    private BubbleToggleView bubbleToggleView ;
    private BubbleNavigationLinearView bubbleNavigationLinearView ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);

        //loading the default fragment
        loadFragment(new HomeFragment());



        BubbleNavigationLinearView bubbleNavigation = (BubbleNavigationLinearView)findViewById(R.id.bottom_navigation_view_linear);

        bubbleNavigation.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                Fragment  selectFragment = null;


                switch (view.getId()){
                    case R.id.l_item_profile:
                        selectFragment = new ProfileFragment();
                        break;

                    case R.id.l_item_aquic:
                        selectFragment = new acquisitionFragment();
                        break;

                    case R.id.l_item_setting:
                        selectFragment = new ControlFragment();
                        break;

                    case R.id.l_item_home:
                        selectFragment = new HomeFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_con,selectFragment).commit();
            }
        });





        final BubbleNavigationLinearView bubbleNavigationLinearView = findViewById(R.id.bottom_navigation_view_linear);
        bubbleNavigationLinearView.setTypeface(Typeface.createFromAsset(getAssets(), "rubik.ttf"));

        bubbleNavigationLinearView.setBadgeValue(0, null);
        bubbleNavigationLinearView.setBadgeValue(1, null); //invisible badge
        bubbleNavigationLinearView.setBadgeValue(2, "7");
        bubbleNavigationLinearView.setBadgeValue(3, "2");
        //bubbleNavigationLinearView.setBadgeValue(4, ""); //empty badge

    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_con,fragment)
                    .commit();
            return true;
        }
        return false;
    }
}




