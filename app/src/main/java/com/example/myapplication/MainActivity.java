package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.tvMain)
    }
    Button buttonCLICK = (Button) findViewById(R.id.buttonCLICK);
buttonCLICK .setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            This.tvMain.setText("CLICK");
        }
    });
}
 }