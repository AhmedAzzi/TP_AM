package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button btnGoToSecondActivity;
    private Button quitter;
    private TextView username;
    private TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        btnGoToSecondActivity = findViewById(R.id.btn_go_to_second_activity);
        btnGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("username", username.getText().toString());
                intent.putExtra("password", password.getText().toString());
                startActivity(intent);
            }
        });



        quitter = findViewById(R.id.quiter);
        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Quitter", " Quitter l'application");
                finish();
            }
        });

    }
}
