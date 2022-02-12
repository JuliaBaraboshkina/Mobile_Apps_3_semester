    package com.example.guess_tthe_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

    TextView tView;
    EditText edText;
    Button button;
    int res;
    int num;
    int lvl;
    int max2 = 100;
    int min2 = 0;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = (TextView)findViewById(R.id.textView1);
        edText = (EditText)findViewById(R.id.editText1);
        button = (Button)findViewById(R.id.button);

    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            TextView headerView = findViewById(R.id.textView1);
            switch (id) {
                case R.id.easy:
                    int max = 50;
                    int min = 0;
                    lvl=1;
                    num = (int) (Math.random() * ((max - min) + 1)) + min;
                    headerView.setText("Попробуйте угадать число (1-50) \n уровень easy");
                    return true;
                case R.id.normal:
                    num = (int) (Math.random() * ((max2 - min2) + 1)) + min2;
                    lvl=2;
                    headerView.setText("Попробуйте угадать число (1-100) \n уровень  normal");
                    return true;
                case R.id.hard:
                    int max3 = 150;
                    int min3 = 0;
                    lvl=3;
                    num = (int) (Math.random() * ((max3 - min3) + 1)) + min3;
                    headerView.setText("Попробуйте угадать число (1-150) \n уровень hard");
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
        public void onClick(View v){
        if (edText.getText().length()==0){
            tView.setText(getResources().getString(R.string.error));
        }
        else{
            res = Integer.parseInt(edText.getText().toString());
            if (lvl==1){
                if (res > 50)
                    tView.setText(getResources().getString(R.string.error));
                else if (res < 1)
                    tView.setText(getResources().getString(R.string.error));
                else if (res >num)
                    tView.setText(getResources().getString(R.string.ahead));
                else if (res ==num)
                    tView.setText(getResources().getString(R.string.hit));
                else if (res < num)
                    tView.setText(getResources().getString(R.string.behind));
            }
            else if (lvl==2){
                if (res > 100)
                    tView.setText(getResources().getString(R.string.error));
                else if (res < 1)
                    tView.setText(getResources().getString(R.string.error));
                else if (res >num)
                    tView.setText(getResources().getString(R.string.ahead));
                else if (res ==num)
                    tView.setText(getResources().getString(R.string.hit));
                else if (res < num)
                    tView.setText(getResources().getString(R.string.behind));
            }
            else if (lvl==3){
                if (res > 150)
                    tView.setText(getResources().getString(R.string.error));
                else if (res < 1)
                    tView.setText(getResources().getString(R.string.error));
                else if (res >num)
                    tView.setText(getResources().getString(R.string.ahead));
                else if (res ==num)
                    tView.setText(getResources().getString(R.string.hit));
                else if (res < num)
                    tView.setText(getResources().getString(R.string.behind));
            }
        }
        }
        public void onClick2(View v){
            res = (int) (Math.random()*((max2-min2)+1))+min2;
            tView.setText(getResources().getString(R.string.try_to_guess));

        }

        public void onCLick3(View v){
        finish();


        }

}