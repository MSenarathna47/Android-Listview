package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class trirdActivity extends AppCompatActivity {
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trird);






    }

    public void myMethod(View view) {
        tx = findViewById(R.id.textView2);
        tx.setText("Coping is rtrisctly PROHIBITED");
    }
}