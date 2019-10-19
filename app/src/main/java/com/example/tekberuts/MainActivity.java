package com.example.tekberuts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.tekberuts.R;
import com.example.tekberuts.buku1;
import com.example.tekberuts.buku2;
import com.example.tekberuts.buku3;
import com.example.tekberuts.buku4;
import com.example.tekberuts.buku5;
import com.example.tekberuts.buku6;
import com.example.tekberuts.profil;

public class MainActivity extends AppCompatActivity {
    private LinearLayout btnbuku1, btnbuku2, btnbuku3, btnbuku4, btnbuku5, btnbuku6, btnprofil;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbuku1 = (LinearLayout) findViewById(R.id.buku1);

        btnbuku1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buku1N = new Intent(MainActivity.this, buku1.class);
                startActivity(buku1N);
            }
        });

        btnbuku2 = (LinearLayout) findViewById(R.id.buku2);

        btnbuku2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buku2N = new Intent(MainActivity.this, buku2.class);
                startActivity(buku2N);
            }
        });

        btnbuku3 = (LinearLayout) findViewById(R.id.buku2);

        btnbuku3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buku3N = new Intent(MainActivity.this, buku3.class);
                startActivity(buku3N);
            }
        });

        btnbuku4 = (LinearLayout) findViewById(R.id.buku4);

        btnbuku4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buku4N = new Intent(MainActivity.this, buku4.class);
                startActivity(buku4N);
            }
        });

        btnbuku5 = (LinearLayout) findViewById(R.id.buku5);

        btnbuku5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buku5N = new Intent(MainActivity.this, buku5.class);
                startActivity(buku5N);
            }
        });
        btnbuku6 = (LinearLayout) findViewById(R.id.buku6);

        btnbuku6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buku6N = new Intent(MainActivity.this, buku6.class);
                startActivity(buku6N);
            }
        });
        btnprofil = (LinearLayout) findViewById(R.id.profil);

        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profilN = new Intent(MainActivity.this, profil.class);
                startActivity(profilN);
            }
        });
    }
}