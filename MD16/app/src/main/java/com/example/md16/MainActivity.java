package com.example.md16;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvColor, tvSize;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvColor = (TextView) findViewById(R.id.tvColor);
        tvSize = (TextView) findViewById(R.id.tvSize);
        // для tvColor и tvSize необходимо создавать контекстное меню
        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }
    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;
    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                break;
            case R.id.tvSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // пункты меню для tvColor
            case MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color");
                break;
            case MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color");
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color");
                break;
            // пункты меню для tvSize
            case MENU_SIZE_22:
                tvSize.setTextSize(22);
                tvSize.setText("Text size");
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                tvSize.setText("Text size");
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                tvSize.setText("Text size");
                break;
        }
        return super.onContextItemSelected(item);
    }



}