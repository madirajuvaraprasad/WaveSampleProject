package com.example.newscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateInvoiceActivity extends AppCompatActivity {
    Button addCustomerButton,addItemButton;
    TextView doneFloatButton,amountDueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_invoice_layout);
        addCustomerButton = (Button) findViewById(R.id.addCustomerButton);
        addItemButton = (Button) findViewById(R.id.addItemButton);
        amountDueButton = (TextView) findViewById(R.id.amountDueButton);
        doneFloatButton = (TextView) findViewById(R.id.doneFloatButton);
//        UtilityFIle.setPrimararyColorForButton(addCustomerButton);
//        UtilityFIle.setPrimararyColorForButton(addItemButton);
//        UtilityFIle.setPrimararyColorForButton(amountDueButton);
        doneFloatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateInvoiceActivity.this, InvoiceActivity.class);
                startActivity(intent);

            }
        });

    }

}


