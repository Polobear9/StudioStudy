package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.bt_toPost);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        Toast.makeText(this, "move", Toast.LENGTH_SHORT).show();
    }
}