package com.example.engineeringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private Button mbtObCalc, mbtEngCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtObCalc = findViewById(R.id.btObCalc);
        mbtEngCalc = findViewById(R.id.btEngCalc);
        final FrameLayout frameLayoutObCalc = findViewById(R.id.frameLayoutObCalc);
        final FrameLayout frameLayoutEngCalc = findViewById(R.id.frameLayoutEngCalc);
        frameLayoutObCalc.setVisibility(View.GONE);
        frameLayoutEngCalc.setVisibility(View.VISIBLE);


        mbtObCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameLayoutObCalc.setVisibility(View.VISIBLE);
                frameLayoutEngCalc.setVisibility(View.GONE);
            }
        });

        mbtEngCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameLayoutEngCalc.setVisibility(View.VISIBLE);
                frameLayoutObCalc.setVisibility(View.GONE);
            }
        });



    }
}
