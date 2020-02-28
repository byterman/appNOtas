package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    String arrayCaracteres[];
    int[] nota1;
    int[] nota2;
    int[] nota3;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Intent recogerDatos = getIntent();
        arrayCaracteres = recogerDatos.getStringArrayExtra("arrayCaracteres");
        nota1 = recogerDatos.getIntArrayExtra("nota1");
        nota2 = recogerDatos.getIntArrayExtra("nota2");
        nota3 = recogerDatos.getIntArrayExtra("nota3");
        contador = recogerDatos.getIntExtra("contador",0);




        RecyclerView recyclerView = findViewById(R.id.recycleview);
        com.example.exrecyclerview.RecyclerViewAdapter adapter = new com.example.exrecyclerview.RecyclerViewAdapter(this, arrayCaracteres, nota1,nota2,nota3,contador);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager((this)));

    }
}
