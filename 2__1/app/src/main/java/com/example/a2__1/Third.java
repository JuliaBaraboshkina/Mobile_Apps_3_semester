package com.example.a2__1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Third extends AppCompatActivity {
    final String TAG = "States";
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Third: onCreate()");
        setContentView(R.layout.activity_third);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.button):
                Intent intent_1 = new Intent(this, MainActivity.class);
                startActivity(intent_1);
                break;
            case (R.id.button2):
                Intent intent_2 = new Intent(this, Second.class);
                startActivity(intent_2);
                break;
            case (R.id.button4):
                Intent intent_4 = new Intent(this, Fourth.class);
                startActivity(intent_4);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.window_1):
                Intent intent_2 = new Intent(this, MainActivity.class);
                startActivity(intent_2);
                break;
            case (R.id.window_2):
                Intent intent_3 = new Intent(this, Second.class);
                startActivity(intent_3);
                break;
            case (R.id.window_4):
                Intent intent_4 = new Intent(this, Fourth.class);
                startActivity(intent_4);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }
}

