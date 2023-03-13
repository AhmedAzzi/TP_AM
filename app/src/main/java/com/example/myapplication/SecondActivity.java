package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    private Button btnGoBackToMainActivity;
    private TextView tvUsername;
    private TextView tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the extras from the Intent that started this activity
        Bundle extras = getIntent().getExtras();
        String username = extras.getString("username");
        String password = extras.getString("password");

        // Set up the TextViews to display the username and password
        tvUsername = findViewById(R.id.tv_username);
        tvPassword = findViewById(R.id.tv_password);
        tvUsername.setText("Username: " + username);
        tvPassword.setText("Password: " + password);

        btnGoBackToMainActivity = findViewById(R.id.btn_go_back_to_main_activity);
        btnGoBackToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "onClick: go back to MainActivity");
                finish();
            }
        });
    }
}
