package com.example.appnotas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String arrayCaracteres[] = new String[50];
    int[] nota1 = new int[50];
    int[] nota2 = new int[50];
    int[] nota3 = new int[50];
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button botontest2 = findViewById(R.id.botontest2);
        botontest2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToAddUsers();
            }
        });

        final Button Listaalumnos = findViewById(R.id.Listaalumnos);
        Listaalumnos.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            goToLista();
        }
    });
}


    private void goToAddUsers() {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("arrayCaracteres", arrayCaracteres);
        intent.putExtra("nota1", nota1);
        intent.putExtra("nota2", nota2);
        intent.putExtra("nota3", nota3);
        intent.putExtra("contador", contador);
        startActivityForResult(intent, 1);
    }

    private void goToLista() {
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("arrayCaracteres", arrayCaracteres);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                arrayCaracteres = data.getStringArrayExtra("arrayCaracteres");
                nota1 = data.getIntArrayExtra("nota1");
                nota2 = data.getIntArrayExtra("nota2");
                nota3 = data.getIntArrayExtra("nota3");
                contador = data.getIntExtra("contador", 0);

                TextView txtnombre = findViewById(R.id.textresultado);
                txtnombre.setText(arrayCaracteres[0] + "----" + Integer.toString(contador));

            }

        }
    }


}
