package com.example.mishva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.mishva.Solution;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    int x;
    EditText a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
    }

    public void gennum(View view) {
        x = rnd.nextInt(100)+1;
        a.setText((double)x+rnd.nextDouble()+"");
        x = rnd.nextInt(101);
        b.setText((double)x+rnd.nextDouble()+"");
        x=rnd.nextInt(101);
        c.setText((double)x+rnd.nextDouble()+"");

    }

    public void gets(View view) {
        Intent s1 = new Intent(this, Solution.class);
        s1.putExtra("a",a.getText());
        s1.putExtra("b",b.getText());
        s1.putExtra("c",c.getText());
    }
}
