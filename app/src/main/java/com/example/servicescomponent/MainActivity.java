package com.example.servicescomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.security.Provider;
import java.security.Provider.Service;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ServiceClass serviceClass = new ServiceClass();
    }
}