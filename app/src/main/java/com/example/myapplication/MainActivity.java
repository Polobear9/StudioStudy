package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_toHome).setOnClickListener(this);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_save).setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.iv_like:
                Toast.makeText(this, "Like this write!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_save:
                Toast.makeText(this, "Saved!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_toHome:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(this, "go to more info!!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}