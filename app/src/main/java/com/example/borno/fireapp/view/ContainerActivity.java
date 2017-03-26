package com.example.borno.fireapp.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.borno.fireapp.R;
import com.example.borno.fireapp.view.fragment.ProfileFragment;
import com.example.borno.fireapp.view.fragment.SearchFragment;
import com.example.borno.fireapp.view.fragment.TasksFragment;
import android.view.MenuItem;

import static android.R.attr.fragment;

public class ContainerActivity extends AppCompatActivity implements
        SearchFragment.OnFragmentInteractionListener,
        TasksFragment.OnFragmentInteractionListener,
        ProfileFragment.OnFragmentInteractionListener {

    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, TasksFragment.newInstance());
        fragmentTransaction.commit();

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottonbar_NavView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.action_search:
                        fragment = SearchFragment.newInstance();
                        break;
                    case R.id.action_task:
                        fragment = TasksFragment.newInstance();
                        break;
                    case R.id.action_profile:
                        fragment = ProfileFragment.newInstance();
                        break;
                }
                if (fragment != null) {
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.container, fragment);
                    fragmentTransaction.commit();
                }
                return true;
            }
        });

    }
}
