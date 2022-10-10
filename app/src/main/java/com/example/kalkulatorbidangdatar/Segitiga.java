package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    private EditText alas, tinggi;
    private Button hitung;
    private TextView hasilhitungluas, hasilhitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hitung = findViewById(R.id.hitung);
        hasilhitungluas = findViewById(R.id.hasilhitungluas);
        hasilhitungkeliling = findViewById(R.id.hasilhitungkeliling);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = alas.getText().toString();
                String nilai2 = tinggi.getText().toString();

                if (nilai1.isEmpty()) {
                    alas.setError("Data tidak boleh dikosongkan");
                    alas.requestFocus();
                }
                else if (nilai2.isEmpty()) {
                    tinggi.setError("Data tidak boleh dikosongkan");
                    tinggi.requestFocus();
                }
                else{
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double luas = 0.5 * alas * tinggi;
                    Double keliling = alas + tinggi + (Math.sqrt((alas * alas) + (tinggi * tinggi)));
                    hasilhitungluas.setText("Luas = " + luas);
                    hasilhitungkeliling.setText("Keliling = " + keliling);
                }

            }
        });
    }



}