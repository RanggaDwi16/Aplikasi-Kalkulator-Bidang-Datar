package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Persegi = findViewById(R.id.persegi);
        Button Segitia = findViewById(R.id.segitiga);
        Button Lingkaran = findViewById(R.id.lingkaran);

        Persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persegi(v);
            }
        });

        Segitia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                segitiga(v);
            }
        });

        Lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lingkaran(v);
            }
        });


    }

    private void lingkaran(View v) {
        Intent it = new Intent(this, Lingkaran.class);
        startActivity(it);
    }

    private void segitiga(View v) {
        Intent it = new Intent(this, Segitiga.class);
        startActivity(it);
    }

    private void persegi(View v) {
        Intent it = new Intent(this, Persegi.class);
        startActivity(it);
    }


}