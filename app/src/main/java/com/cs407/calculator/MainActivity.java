package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void add(View view) {
        int sum = 0;
        EditText num1Text = (EditText) findViewById(R.id.firstNum);
        EditText num2Text = (EditText) findViewById(R.id.secondNum);
        sum = Integer.parseInt(num1Text.getText().toString()) + Integer.parseInt(num2Text.getText().toString());
        goToActivity(String.valueOf(sum));
    }

    public void subtract(View view) {
        int sum = 0;
        EditText num1Text = (EditText) findViewById(R.id.firstNum);
        EditText num2Text = (EditText) findViewById(R.id.secondNum);
        sum = Integer.parseInt(num1Text.getText().toString()) - Integer.parseInt(num2Text.getText().toString());
        goToActivity(String.valueOf(sum));
    }

    public void multiply(View view) {
        int total = 0;
        EditText num1Text = (EditText) findViewById(R.id.firstNum);
        EditText num2Text = (EditText) findViewById(R.id.secondNum);
        total = Integer.parseInt(num1Text.getText().toString()) * Integer.parseInt(num2Text.getText().toString());
        goToActivity(String.valueOf(total));
    }

    public void divide(View view) {
        int total = 0;
        EditText num1Text = (EditText) findViewById(R.id.firstNum);
        EditText num2Text = (EditText) findViewById(R.id.secondNum);
        if (Integer.parseInt(num2Text.getText().toString()) == 0) {
            goToActivity("Divide by 0 error");
        }
        total = Integer.parseInt(num1Text.getText().toString()) / Integer.parseInt(num2Text.getText().toString());
        goToActivity(String.valueOf(total));
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, Calculation.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
}