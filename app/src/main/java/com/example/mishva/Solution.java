package com.example.mishva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Solution extends AppCompatActivity {
    WebView wv;
    Intent g1 = getIntent();
    String x1 = g1.getStringExtra("a") , x2 = g1.getStringExtra("b") , c = g1.getStringExtra("c");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        wv = findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.set
    }
}
