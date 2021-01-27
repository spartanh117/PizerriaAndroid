package com.example.pizerriaandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;


public class Pedido extends AppCompatActivity {
   private TabLayout tabLayout;
   private ViewPager viewPager;
   private ViewPagerAdapter viewPagerAdapter;
   private AppBarLayout appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        setUpView();
        setUpViewPagerAdapter();
    }

    private void setUpView(){
        tabLayout = (TabLayout)findViewById(R.id.tabs);
        viewPager = (ViewPager)findViewById(R.id.pager);
        viewPagerAdapter =  new ViewPagerAdapter(getSupportFragmentManager());
        appBarLayout = (AppBarLayout)findViewById(R.id.appBarLayout);;
    }

    private void setUpViewPagerAdapter(){
        viewPagerAdapter.addFragment(new FavoritaFragment(),"Favorita");
        viewPagerAdapter.addFragment(new PredeterminadasFragment(),"Predeterminadas");
        viewPagerAdapter.addFragment(new PersonalizadaFragment(),"Personalizada");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}
