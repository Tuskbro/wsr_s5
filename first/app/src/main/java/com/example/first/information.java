package com.example.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        TextView inform = (TextView)findViewById(R.id.infText);
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        inform.setText(i.getStringExtra("infa"));

    }
}
