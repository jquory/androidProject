package com.example.pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtUsername, txtEmail;
    TextView display;
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.name);
        txtUsername = findViewById(R.id.username);
        txtEmail = findViewById(R.id.email);

        btnDisplay = findViewById(R.id.button);
        display = findViewById(R.id.TextDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtName.getText().toString().isEmpty() || txtUsername.getText().toString().isEmpty() || txtEmail.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Empty field", Toast.LENGTH_SHORT).show();
                }else{
                    String name = txtName.getText().toString();
                    String user = txtUsername.getText().toString();
                    String email = txtEmail.getText().toString();
                    display.setText("Nama Anda adalah : " +name + "\n" + "NIM Anda adalah : " + user + "\n" + "Email anda adalah : " + email + "\n");
                }
            }
        });
    }
}