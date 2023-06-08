package com.example.pr10_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends Activity implements View.OnClickListener {
    Button borshc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        borshc = (Button) findViewById(R.id.button2);
        borshc.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(this, borsch.class);
        startActivity(in);
    }
}