package com.example.md14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    TextView TextView;
    Button Button;
    Button button_ok,button_cancel, button_delete;
    EditText EditText;
    ListView ListView;
    ArrayAdapter arrayAdapter;
    ArrayList name_list = new ArrayList();
    Object posit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView = findViewById(R.id.textView);
        Button = findViewById(R.id.button);
        button_ok = findViewById(R.id.button_ok);
        button_cancel= findViewById(R.id.button_cancel);
        button_delete = findViewById(R.id. button_delete );
        EditText = (EditText) findViewById(R.id.editText);
        ListView = findViewById(R.id.listView);
        ListView.setOnItemClickListener(this);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name_list);
        ListView.setAdapter(arrayAdapter);
        Button.setOnClickListener(this);
        TextView.setText("Hello!");
        button_ok.setOnClickListener(btn);
        button_cancel.setOnClickListener(btn);
        button_delete.setOnClickListener(btn);
    }

    @Override
    public void onClick(View v) {
        TextView.setText("Hello,"+EditText.getText().toString()+"!");
        name_list.add(EditText.getText().toString());
        Set<String> s = new HashSet<>(name_list);
        name_list.clear();
        name_list.addAll(s);
        Collections.sort(name_list);
        arrayAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        posit = name_list.get(position);
        TextView.setText(name_list.get(position).toString() + " is in list!");
    }
    View.OnClickListener btn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_ok:
                    TextView.setText("Нажата кнопка OK");
                    Toast.makeText(getApplicationContext(), "Нажата кнопка OK", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button_cancel:
                    TextView.setText("Нажата кнопка Cancel");
                    Toast.makeText(getApplicationContext(), "Нажата кнопка CANCEL", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button_delete:
                    TextView.setText("Удален элемент: " + posit);
                    name_list.remove(posit);
                    Toast.makeText(getApplicationContext(), "Нажата кнопка DELETE", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };

}

