package com.education.buttonlistner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeWidget();
        buttonClickListner();
    }

    private void intializeWidget(){
        button=(Button)findViewById(R.id.button_bt);
    }

    private void buttonClickListner(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button OnClicListner", Toast.LENGTH_SHORT).show();
            }
        });
    }
}