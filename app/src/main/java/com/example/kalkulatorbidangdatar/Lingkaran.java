package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {

    private EditText jari;
    private Button hitung;
    private TextView hasilhitungluas, hasilhitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        jari = findViewById(R.id.jari);
        hitung = findViewById(R.id.hitung);
        hasilhitungluas = findViewById(R.id.hasilhitungluas);
        hasilhitungkeliling = findViewById(R.id.hasilhitungkeliling);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = jari.getText().toString();
                if (nilai.isEmpty()) {
                    jari.setError("Data tidak boleh dikosongkan");
                }
                else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * ( jari * jari);
                    Double keliling = 2 * 3.14 * jari;
                    hasilhitungluas.setText("Luas = " + luas);
                    hasilhitungkeliling.setText("Keliling = " + keliling);
                }
            }
        });
    }


}