package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LaynearLayoutActivity extends AppCompatActivity {
    EditText nhapso1, nhapso2;
    Button cong, tru, nhan, chia;
    TextView resuil;
    Button resset, close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laynear_layout);
        mapping();
        setAction();
    }

    private void setAction() {
        resset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nhapso1.setText("");
                nhapso2.setText("");
                resuil.setText("");
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapso1.getText().toString());
                int b = Integer.parseInt(nhapso2.getText().toString());

                int c = a + b;
                resuil.setText(String.valueOf(a) + "+" + String.valueOf(b) + " = " + String.valueOf(c));

            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapso1.getText().toString());
                int b = Integer.parseInt(nhapso2.getText().toString());

                int c = a - b;
                resuil.setText(String.valueOf(a) + "-" + String.valueOf(b) + " = " + String.valueOf(c));

            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapso1.getText().toString());
                int b = Integer.parseInt(nhapso2.getText().toString());

                int c = a * b;

                resuil.setText(String.valueOf(a) + "*" + String.valueOf(b) + " = " + String.valueOf(c));
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(nhapso1.getText().toString());
                int b = Integer.parseInt(nhapso2.getText().toString());

                int c = a / b;
                resuil.setText(String.valueOf(a) + "/" + String.valueOf(b) + " = " + String.valueOf(c));

            }
        });
    }

    private void mapping() {
        nhapso1 = findViewById(R.id.edit1);
        nhapso2 = findViewById(R.id.edit2);

        cong = findViewById(R.id.btncong);
        tru = findViewById(R.id.btntru);
        nhan = findViewById(R.id.btntru);
        chia = findViewById(R.id.btnchia);

        resuil = findViewById(R.id.result);

        resset = findViewById(R.id.reset);
        close = findViewById(R.id.close);

    }
}