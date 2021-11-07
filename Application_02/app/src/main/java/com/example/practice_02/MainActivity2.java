package com.example.practice_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("t1", " onCreate Activity Main2");
        textView= findViewById(R.id.textView2);
        btn1= findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= getIntent();
                textView.setText(intent.getStringExtra("userId"));
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("t1", "onStart Activity Main2");
    }
    @Override
    protected void onResume() {
        super. onResume();
        Log.d("t1", " onResume Activity Main2");
    }
    @Override
    protected void onPause() {
        super. onPause();
        Log.d("t1", " onPause Activity Main2");
    }
    @Override
    protected void onStop() {
        super. onStop();
        Log.d("t1", " onStop Activity Main2");
    }
    @Override
    protected void onDestroy() {
        super. onDestroy();
        Log.d("t1", " onDestroy Activity Main2");
    }
}