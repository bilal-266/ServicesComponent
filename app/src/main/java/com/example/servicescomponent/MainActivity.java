package com.example.servicescomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Provider;
import java.security.Provider.Service;

public class MainActivity extends AppCompatActivity {
    Button startService,stopService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ServiceClass serviceClass = new ServiceClass();
        startService = findViewById(R.id.startServiceBtn);
        stopService = findViewById(R.id.stopServiceBtn);

        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serviceClass.onCreate();
            }
        });

        stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serviceClass.onDestroy();
            }
        });
    }
}