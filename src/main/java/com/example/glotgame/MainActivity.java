package com.example.glotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //變數區
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fineView
        btnStart = (Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(btnStartOnClickListener); //set event
    }

    //private function
  View.OnClickListener btnStartOnClickListener =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent intent  = new Intent();
          intent.setClass(MainActivity.this,SlotGameActivity.class); //自己,別人
          startActivity(intent);
        }
    };

}
