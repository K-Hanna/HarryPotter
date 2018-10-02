package com.example.android.harrypotter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int score = 0;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.ans_1a);
        radioButton2 = findViewById(R.id.ans_2c);
        radioButton3 = findViewById(R.id.ans_3b);
        radioButton4 = findViewById(R.id.ans_4a);
        radioButton5 = findViewById(R.id.ans_5b);
        radioButton6 = findViewById(R.id.ans_6c);
    }

    public void submit (View v){
        EditText nameField = (EditText) findViewById(R.id.edit_text);
        String name = nameField.getText().toString();

        if(radioButton1.isChecked()){
            score += 1;
        }
        if(radioButton2.isChecked()){
            score += 1;
        }
        if (radioButton3.isChecked()) {
            score += 1;
        }
        if(radioButton4.isChecked()){
            score += 1;
        }
        if(radioButton5.isChecked()){
            score += 1;
        }
        if(radioButton6.isChecked()){
            score += 1;
        }
        if(score==6)
            Toast.makeText(this,"Congratulations, " + name + ", you are the biggest Harry Potter's fan!", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, name + ", you scored only " + score + " points out of 6.", Toast.LENGTH_LONG).show();
    }

    public void reset(View v) {
        score = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
