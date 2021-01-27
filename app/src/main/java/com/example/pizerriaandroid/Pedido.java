package com.example.pizerriaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class Pedido extends AppCompatActivity {
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabs.setOnTabSelectedListener(
                new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        if(tab.isSelected()){
                            tab.setCustomView(R.layout.fragment_personalizada);
                        }
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {
                        if(tab.isSelected()){
                            tab.setCustomView(R.layout.fragment_personalizada);
                        }
                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {
                        if(tab.isSelected()){
                            tab.setCustomView(R.layout.fragment_personalizada);
                        }
                    }
                }
        );
    }
}
