package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgMoeda ,btnVoltar;

    int images[] = {R.drawable.moeda_cara, R.drawable.moeda_coroa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        btnVoltar = findViewById(R.id.btnVoltar);
        imgMoeda = findViewById(R.id.imgMoeda);

        recuperarDados();
    }

    private void recuperarDados() {

        Bundle dados = getIntent().getExtras();
        int random = dados.getInt("numero");
        imgMoeda.setImageResource(images[random]);
    }

    public void voltarTela(View view){
        finish();
    }
}