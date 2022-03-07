package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class registeredScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered_screen);

        Bundle recivedInfo = getIntent().getExtras();
        String firstName = recivedInfo.getString("FIRST_NAME");
        String secondName = recivedInfo.getString("SECOND_NAME");
        String email = recivedInfo.getString("EMAIL");
        TextView registrationResult = findViewById(R.id.textView2);
        if(TextUtils.isEmpty(firstName) || TextUtils.isEmpty(secondName) || TextUtils.isEmpty(email))
        {
            registrationResult.setText("Failed");
        }
        else{
            registrationResult.setText("Success");
        }

    }

    public void goBackToMainActivity(View view) {
        Intent goBack = new Intent(this,MainActivity.class);
        startActivity(goBack);
    }
}