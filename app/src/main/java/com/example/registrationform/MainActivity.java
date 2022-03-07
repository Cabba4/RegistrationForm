package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void registerFormInfo(View view) {
        EditText firstNameInput = findViewById(R.id.editTextTextPersonName);
        EditText secondNameInput = findViewById(R.id.editTextTextPersonName2);
        EditText emailAddressInput = findViewById(R.id.editTextTextEmailAddress);

        String firstName = firstNameInput.getText().toString();
        String secondName = secondNameInput.getText().toString();
        String emailAddress = emailAddressInput.getText().toString();
        Intent intent = new Intent(this,registeredScreen.class);
        // To pass more than one value via intent pass a bundle

        Bundle info = new Bundle();
        info.putString("FIRST_NAME",firstName);
        info.putString("SECOND_NAME",secondName);
        info.putString("EMAIL",emailAddress);
        intent.putExtras(info);
        startActivity(intent);
    }
}