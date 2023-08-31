package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.btnJogar);
        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = new Random().nextInt(2);
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });
    }
}