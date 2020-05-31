package com.example.newscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button googleButton,facebookButton;
AutoCompleteTextView email;
EditText password;
TextView nextFloatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        googleButton = (Button) findViewById(R.id.googleButton);
        facebookButton = (Button) findViewById(R.id.facebookButton);
        email = (AutoCompleteTextView) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        nextFloatButton = (TextView) findViewById(R.id.nextFloatButton);
        UtilityFIle.setSecondaryColorForButton(googleButton);
        UtilityFIle.setSecondaryColorForButton(facebookButton);
        nextFloatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddCustomerActivity.class);
                startActivity(intent);

            }
        });

    }
}
