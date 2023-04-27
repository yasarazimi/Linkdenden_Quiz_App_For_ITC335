package com.example.linkdendenquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    TextView Name, Email, Password, Contacts, Education;
    EditText Name1, Email1, Password1, Contacts1, Education1;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Name= findViewById(R.id.Name1);
        Email= findViewById(R.id.Email1);
        Password= findViewById(R.id.Password1);
        Contacts= findViewById(R.id.Contacts1);
        Education= findViewById(R.id.Education1);
        save= findViewById(R.id.save);

        Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openName();
            }
        });
        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensavebutton();
            }
        });
    }
    public void openName() {

    }
    public void opensavebutton() {
        Toast.makeText(getApplicationContext(), "Your Data has been Saved", Toast.LENGTH_SHORT).show();
        Intent intent20 = new Intent(this, Homefragment.class);
        startActivity(intent20);

    }

}
