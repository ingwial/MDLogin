package com.example.mdlogin;

import androidx.appcompat.app.AppCompatActivity;
//import android.app.Activity;
import android.os.Bundle;

//Antes de Material Desing se ocupaba Activity
public class MainActivity extends /*Activity*/ AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}