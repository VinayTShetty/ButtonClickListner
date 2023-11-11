package com.education.buttonlistner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        intializeWidget();
        OnCliclistner();
    }

    private void intializeWidget(){
        button=(Button) findViewById(R.id.button_bt);
    }

    private void OnCliclistner(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToActivityB();
            }
        });
    }

    private void navigateToActivityB(){
        Intent intent = new Intent(this, ActivityA.class);
        startActivity(intent);
        finish();
    }
}