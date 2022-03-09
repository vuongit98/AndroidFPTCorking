package com.example.transferdataactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.transferdataactivity.Interface.Data;

public class MainActivity extends AppCompatActivity implements Data {

    Button btnTransfer ;
    Data listen ;
    public static int getNumberStatic ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listen = (Data) new MainActivity2();
        btnTransfer = findViewById(R.id.btn_transfer);

        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // cach 1: su dung interface

                listen.sendData(10); // gui so 10 sang activity2

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                // cach 2: su dung intent
                intent.putExtra("number", 20) ;
                startActivity(intent);

                // cach 3 su dung bien static
                getNumberStatic = 30 ;
            }
        });
    }

    @Override
    public void sendData(int number) {

    }
}