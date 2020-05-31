package com.example.newscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InvoiceActivity extends AppCompatActivity {
    Button addCustomerButton,addItemButton,amountDueButton;
    TextView doneFloatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invoice_layout);

//        doneFloatButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(InvoiceActivity.this, InvoiceActivity.class);
//                startActivity(intent);
//
//            }
//        });

    }

}

