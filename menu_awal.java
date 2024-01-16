package com.example.bni_mobile;

import static com.example.bni_mobile.R.id.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class menu_awal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_awal);

        ImageButton mobile = findViewById(R.id.mobile);

        mobile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_awal.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ButtonPembayaran = findViewById(R.id.ButtonPembayaran);
        ButtonPembayaran.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_awal.this, pembayaran.class);
                startActivity(intent);
            }
        });

        ImageButton ButtonPembelian = findViewById(R.id.ButtonPembelian);
        ButtonPembelian.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_awal.this, pembelian.class);
                startActivity(intent);
            }
        });

        ImageButton ButtonTransfer = findViewById(R.id.ButtonTransfer);
        ButtonTransfer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_awal.this, transfer.class);
                startActivity(intent);
            }
        });

        ImageButton ButtonRekening = findViewById(R.id.ButtonRekening);
        ButtonRekening.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_awal.this, rekening.class);
                startActivity(intent);
            }
        });

        ImageButton ButtonEwallet = findViewById(R.id.ButtonEwallet);
        ButtonEwallet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu_awal.this, e_wallet.class);
                startActivity(intent);
            }
        });
    }
}
