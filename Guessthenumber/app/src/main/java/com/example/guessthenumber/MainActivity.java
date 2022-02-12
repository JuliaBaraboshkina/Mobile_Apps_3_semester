package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tView;
    EditText edText;
    Button button;
    int res;
    int max_num = 100;
    int min_num = 1;
    int num = (int) (Math.random() * ((max_num - min_num) + 1)) + min_num;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = (TextView) findViewById(R.id.textView1);
        edText = (EditText) findViewById(R.id.editText1);
        button = (Button) findViewById(R.id.button);

    }

    public void onClick(View v) {
        if (edText.getText().length()==0){
            tView.setText(getResources().getString(R.string.error));

        }
        else {
            res = Integer.parseInt(edText.getText().toString());
            if (res > 100)
                tView.setText(getResources().getString(R.string.error));
            else if (res < 1)
                tView.setText(getResources().getString(R.string.error));
            else if (res > num)
                tView.setText(getResources().getString(R.string.ahead));
            else if (res == num)
                tView.setText(getResources().getString(R.string.hit));
            else if (res < num)
                tView.setText(getResources().getString(R.string.behind));
        }



    }

    public void onClick2(View v) {
        res = (int) (Math.random() * ((max_num - min_num) + 1)) + min_num;
        tView.setText(getResources().getString(R.string.try_to_guess));

    }
    public void onClick3(View v){
        finish();
    }
}