package com.example.lifecycleactivity_hw_611;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    private static final String TAG = "LifeCycle_Activity_2";

    private int randomNumber = new Random().nextInt();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);


        if (savedInstanceState != null) {
            randomNumber = savedInstanceState.getInt("number");
        }
        Toast.makeText(this, "number is" + randomNumber, Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onResume");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("number", randomNumber);
        Log.d(TAG, "onSaveInstanceState");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onSaveInstanceState");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        TextView tv = findViewById(R.id.textView2);
        tv.append("\n" + "onRestart");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            TextView tv = findViewById(R.id.textView);
            tv.append("\n" + "onKeyDown");
            Log.d(TAG, "onKeyDown");

        }
        return super.onKeyDown(keyCode, event);

    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            TextView tv = findViewById(R.id.textView);
            tv.append("\n" + "onKeyLongPress");
            Log.d(TAG, "onKeyLongPress");
            return true;
        }
        //return false;
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {

        TextView tv = findViewById(R.id.textView);
        tv.append("\n" + "onBackPressed");
        Log.d(TAG, "onBackPressed");

        //super.onBackPressed();
    }
}
