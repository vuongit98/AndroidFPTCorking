package com.example.transferdataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.transferdataactivity.Interface.Data;

public class MainActivity2 extends AppCompatActivity implements Data {

    public static int getNumber ;
    TextView tvNumber ;
    TextView tvNumberIntent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNumber = findViewById(R.id.tv_number);
        tvNumberIntent = findViewById(R.id.tv_number_intent);
        // lay du lieu khi su dung intent
        Intent intent = getIntent();
        int number = intent.getIntExtra("number",-1);

        // lay du lieu thong qua bien static
        int number1 = MainActivity.getNumberStatic ;
        tvNumber.setText(getNumber+" : bien static: " + number1);
        tvNumberIntent.setText(number+"");

    }

    @Override
    public void sendData(int number) {
        getNumber = number ;
    }
}