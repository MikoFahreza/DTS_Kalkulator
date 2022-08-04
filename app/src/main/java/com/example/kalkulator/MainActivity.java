package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private char operator;
    private double operan1;
    private double operan2;

    private EditText txtAngka1;
    private EditText txtAngka2;
    private EditText txtHasil;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//tambah
        Button btTambah = findViewById(R.id.btTambah);
        btTambah.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View view){
                operator = '+';
                operan1= Double.parseDouble(txtAngka1.getText().toString());
                operan2= Double.parseDouble(txtAngka1.getText().toString());
            }
        });
//kurang
        Button btKurang = findViewById(R.id.btKurang);
        btKurang.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View view){
                operator = '-';
                operan1= Double.parseDouble(txtAngka1.getText().toString());
                operan2= Double.parseDouble(txtAngka1.getText().toString());
            }
        });
//kali
        Button btKali = findViewById(R.id.btKali);
        btKali.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View view){
                operator = '*';
                operan1= Double.parseDouble(txtAngka1.getText().toString());
                operan2= Double.parseDouble(txtAngka1.getText().toString());
            }
        });
//bagi
        Button btBagi = findViewById(R.id.btBagi);
        btBagi.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View view){
                operator = '/';
                operan1= Double.parseDouble(txtAngka1.getText().toString());
                operan2= Double.parseDouble(txtAngka1.getText().toString());
            }
        });

        Button btHasil = findViewById(R.id.btHasil);
        btHasil.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View view){
                double hasil = hitung(operator, operan1, operan2);
                txtHasil.setText(""+hasil);
            }
        });


        txtAngka1 = findViewById(R.id.txtAngka1);
        txtAngka2 = findViewById(R.id.txtAngka2);
        txtHasil = findViewById(R.id.txtHasil);
    }

    private double hitung(char operator, double operan1, double operan2){
        switch(operator){
            case '*':
                return operan1*operan2;
            case '/':
                return operan1/operan2;
            case '+':
                return operan1+operan2;
            case '-':
                return operan1-operan2;
        }
    }
}