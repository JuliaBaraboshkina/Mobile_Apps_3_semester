package com.example.a2__1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Fifth extends AppCompatActivity {
    TextView greet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        greet = findViewById(R.id.greet);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        greet.setText("Hello, " + name);
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
                Intent intent_1 = new Intent(this, MainActivity.class);
                startActivity(intent_1);
                break;
            case (R.id.window_2):
                Intent intent_2 = new Intent(this, Second.class);
                startActivity(intent_2);
                break;
            case (R.id.window_3):
                Intent intent_3 = new Intent(this, Third.class);
                startActivity(intent_3);
                break;
            case (R.id.window_4):
                Intent intent_4 = new Intent(this, Fourth.class);
                startActivity(intent_4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
