package com.example.borno.fireapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.borno.fireapp.view.ContainerActivity;
import com.example.borno.fireapp.view.CreateAccountActivity;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCreateAccout(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class); //instancia de la interfaz a la que se quiere ir
        startActivity(intent);
    }

    public void goTask(View view){
        Intent intent = new Intent(this, ContainerActivity.class); //instancia de la interfaz a la que se quiere ir
        startActivity(intent);
    }
}
