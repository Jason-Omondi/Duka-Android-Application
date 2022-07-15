package com.example.duka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOil = findViewById(R.id.btnOil);
        Button btnUnga = findViewById(R.id.btnUnga);
        Button btnKahawa = findViewById(R.id.btnKahawa);
        Button btnSoap = findViewById(R.id.btnSoap);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnTotal = findViewById(R.id.btnTotal);
        btnOil.setOnClickListener(this);
        btnUnga.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnKahawa.setOnClickListener(this);
        btnSoap.setOnClickListener(this);
        btnTotal.setOnClickListener(this);

        TextView txtOilCount = findViewById(R.id.txtQty1);
        TextView txtUngaCount = findViewById(R.id.txtQty2);
        TextView txtKahawaCount = findViewById(R.id.txtQty3);
        TextView txtSoapCount = findViewById(R.id.txtQty4);
        TextView txtItemsCount = findViewById(R.id.txtItems);
        TextView txtTotalPrice = findViewById(R.id.txtTotal);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnOil:
                TextView txtOilCount = findViewById(R.id.txtQty1);
                Button buttonOil = findViewById(R.id.btnOil);

                int minCount = 0, maxCount;
                while (minCount <= 4){
                    do {
                        txtOilCount.setText("Count " + minCount++);
                    } while (minCount<=4);
                    }
                buttonOil.setEnabled(false);
                break;
            case R.id.btnUnga:
                TextView txtUngaCount = findViewById(R.id.txtQty2);
                break;
            case R.id.btnKahawa:
                TextView txtKahawaCount = findViewById(R.id.txtQty3);
                break;
            case R.id.btnSoap:
                TextView txtSoapCount = findViewById(R.id.txtQty4);
                break;
            case R.id.btnTotal:
                TextView txtTotalPrice = findViewById(R.id.txtTotal);
                break;
            case R.id.btnClear:
                Button buttonClear = findViewById(R.id.btnClear);
                buttonClear.setEnabled(false);
                break;
        }
    }
}