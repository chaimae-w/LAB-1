package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.tvMain);
    }

    }
   btnChangeText = (Button) findViewById(R.id.btnChangeText);
         btnChangeText.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            tvMain.setText("Changed text");
        }
    });
    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("Changed text");
    }
