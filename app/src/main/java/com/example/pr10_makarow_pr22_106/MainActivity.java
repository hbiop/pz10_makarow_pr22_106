package com.example.pr10_makarow_pr22_106;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pr10_makarow_pr22_106.databinding.ActivityMainBinding;

public class MainActivity extends Activity  implements View.OnClickListener {

Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = (Button) findViewById(R.id.button);
        next.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(this, menu.class);
        startActivity(in);
    }
}