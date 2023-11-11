package com.education.buttonlistner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeWidget();
        addOnClickListner();
    }

    private void intializeWidget(){
        button=(Button) findViewById(R.id.button_bt);
    }
    private void addOnClickListner(){
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button_bt){
            Toast.makeText(this, "Button Click Demo", Toast.LENGTH_SHORT).show();
        }
    }


}