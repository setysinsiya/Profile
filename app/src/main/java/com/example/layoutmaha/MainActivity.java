package com.example.layoutmaha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonbuka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonbuka = (Button) findViewById(R.id.buttonbuka);

        buttonbuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActsatu = new Intent(getApplicationContext(), activity_satu.class);
                startActivity(BukaActsatu);

            }
        });
    }
}