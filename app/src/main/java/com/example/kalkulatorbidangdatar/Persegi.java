package com.example.kalkulatorbidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Persegi extends AppCompatActivity {

    private Button hitung;
    private EditText sisipersegi;
    private TextView hasilhitungluas, hasilhitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        sisipersegi = findViewById(R.id.sisipersegi);
        hitung = findViewById(R.id.hitung);
        hasilhitungluas = findViewById(R.id.hasilhitungluas);
        hasilhitungkeliling = findViewById(R.id.hasilhitungkeliling);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = sisipersegi.getText().toString();

                if(nilai.isEmpty()) {
                    sisipersegi.setError("Data tidak boleh dikosongkan");
                    sisipersegi.requestFocus();
                }
                else {
                    Integer sisi = Integer.parseInt(nilai);
                    int luas = sisi * sisi;
                    Integer keliling = 4 * sisi;

                    hasilhitungluas.setText("Luas = " + luas);
                    hasilhitungkeliling.setText("Keliling = " + keliling);
                }
            }
        });
    }





}