package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String arrayCaracteres[];
    int contador;

    int[] nota1;
    int[] nota2;
    int[] nota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent recogerDatos = getIntent();

        arrayCaracteres = recogerDatos.getStringArrayExtra("arrayCaracteres");
        nota1 = recogerDatos.getIntArrayExtra("nota1");
        nota2 = recogerDatos.getIntArrayExtra("nota2");
        nota3 = recogerDatos.getIntArrayExtra("nota3");
        contador = recogerDatos.getIntExtra("contador",0);

        TextView text= findViewById(R.id.textView2);
        text.setText("asdfasdf" + contador);




        final Button btnGuardar = findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText inputnom  = findViewById(R.id.inputnom);
                String nomGuardar = inputnom.getText().toString();

                EditText inputnota1  = findViewById(R.id.inputnota1);
                int n1 = Integer.parseInt(inputnota1.getText().toString());

                EditText inputnota2  = findViewById(R.id.inputnota2);
                int n2 =  Integer.parseInt(inputnota2.getText().toString());

                EditText inputnota3  = findViewById(R.id.inputnota3);
                int n3 =   Integer.parseInt(inputnota3.getText().toString());


                arrayCaracteres[contador] = nomGuardar;

                nota1[contador] = n1;
                nota2[contador] = n2;
                nota3[contador] = n3;

                System.out.println(nota1[contador]);
                System.out.println(nota2[contador]);
                System.out.println(nota3[contador]);
                contador++;

            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("arrayCaracteres",arrayCaracteres);
        returnIntent.putExtra("nota1",nota1);
        returnIntent.putExtra("nota2",nota2);
        returnIntent.putExtra("nota3",nota3);
        returnIntent.putExtra("contador",contador);
        setResult(RESULT_OK, returnIntent);
        finish();
    }



}

