package com.snovia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    Button button;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
    }

    public void increaseNumber(View view) {
           count=Integer.parseInt(textview.getText().toString());
           count++;
           textview.setText(String.valueOf(count));
    }
}