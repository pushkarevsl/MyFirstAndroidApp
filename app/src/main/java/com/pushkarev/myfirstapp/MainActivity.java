package com.pushkarev.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plList = findViewById(R.id.tv_pl_names);

        String[] names = {"Java", "Python", "Ruby", "Js",
                "Matlab", "C", "C++", "Haskel", "Lisp", "Rust", "Go"};

        plList.setText("");

        for (String name : names) {
            plList.append(name + "\n");
        }
    }

}