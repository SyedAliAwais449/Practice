package com.example.practice_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("t1", " onCreate Activity Main");
        textView= findViewById(R.id.textView);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("t1", "onStart Activity Main");
    }
    @Override
    protected void onResume() {
        super. onResume();
        Log.d("t1", " onResume Activity Main");
    }
    @Override
    protected void onPause() {
        super. onPause();
        Log.d("t1", " onPause Activity Main");
    }
    @Override
    protected void onStop() {
        super. onStop();
        Log.d("t1", " onStop Activity Main");
    }
    @Override
    protected void onDestroy() {
        super. onDestroy();
        Log.d("t1", " onDestroy Activity Main");
    }
    public void onClick(View v){
        Intent intent;

        switch (v.getId()) {

            case R.id.button2:
                intent= new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("userId","bsef18a536");
                startActivity(intent);
                break;
            case R.id.button:
                Uri uri= Uri.parse("tel:+923001234567");
                intent= new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
                break;
            case R.id.button4:
                String message= "Syed Ali Awais from pucit, bsef18a536";
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(intent);
                break;
            case R.id.button5:
                String URL= "https://github.com/SyedAliAwais449/Practice";
                Uri webpage = Uri.parse(URL);
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                break;
            case R.id.button6:
                String address= "bsef18a512@pucit.edu.pk";
                String subject= "Checking email functionality";
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, address);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
        }
    }
    @Override

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("value", "asdf");
        Log.d("t1", "onSaveInstanceState: ");
    }
    @Override

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("t1", "onRestoreInstanceState: ");
        String myString = savedInstanceState.getString("value");
        textView.setText(myString);

    }
}