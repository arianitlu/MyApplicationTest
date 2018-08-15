package com.example.pluscomputers.myapplicationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1, txt2;
    EditText editText1, editText2;
    Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txt1 = findViewById(R.id.textView1);
        txt2 = findViewById(R.id.textView2);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_name = editText1.getText().toString();
                txt1.setText(str_name);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_surname = editText2.getText().toString();
                txt2.setText(str_surname);
            }
        });
    }
}
