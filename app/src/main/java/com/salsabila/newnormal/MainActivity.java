package com.salsabila.newnormal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJagaDiri = findViewById(R.id.btn_jaga_diri);
        btnJagaDiri.setOnClickListener(this);

        Button btnCuciTangan = findViewById(R.id.btn_cuci_tangan);
        btnCuciTangan.setOnClickListener(this);

        Button btnPakaiMasker = findViewById(R.id.btn_pakai_masker);
        btnPakaiMasker.setOnClickListener(this);

        Button btnPolaHidup = findViewById(R.id.btn_pola_hidup);
        btnPolaHidup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_jaga_diri:
                Intent oneActivity = new Intent(MainActivity.this, OneActivity.class);
                startActivity(oneActivity);
                break;
            case R.id.btn_cuci_tangan:
                Intent twoActivity = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(twoActivity);
                break;
            case R.id.btn_pakai_masker:
                Uri webpage = Uri.parse("https://nasional.okezone.com/read/2020/08/10/337/2259522/virus-corona-berukuran-0-1-mikron-satgas-imbau-pakai-masker-dengan-tepat");
                Intent webActivity = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webActivity);
                break;
            case R.id.btn_pola_hidup:
                Intent fourActivity = new Intent(MainActivity.this, FourActivity.class);
                startActivity(fourActivity);
                break;
        }
    }
}