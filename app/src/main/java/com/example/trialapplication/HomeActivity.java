package com.example.trialapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    EditText edtUsername;
    Button BtnSubmit;
    String enteredUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        edtUsername = findViewById(R.id.edtUsername);
        BtnSubmit = findViewById(R.id.BtnSubmit);
        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredUsername = edtUsername.getText().toString();
                Intent navigateToMain = new Intent(HomeActivity.this,MainActivity.class);
                navigateToMain.putExtra("username",enteredUsername) ;
                startActivity(navigateToMain);



            }
        });

    }
}