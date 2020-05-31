package com.example.newscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddCustomerActivity extends AppCompatActivity {
    Button info_button;
    TextView doneFloatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_customer_layout);
        info_button = (Button) findViewById(R.id.info_button);
        doneFloatButton = (TextView)findViewById(R.id.doneFloatButton);
        UtilityFIle.setSecondaryColorForButton(info_button);
        doneFloatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCustomerActivity.this, CreateInvoiceActivity.class);
                startActivity(intent);
            }
        });

    }

}
