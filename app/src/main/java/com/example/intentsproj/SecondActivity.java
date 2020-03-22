package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.intentsproj.R.id.ResultView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //getting input values
        EditText num1 = findViewById(R.id.numone);
        EditText num2 = findViewById(R.id.numtwo);

        Bundle getValues = getIntent().getExtras();
        String data1  = getValues.getString("input01");
        String data2  = getValues.getString("input02");
        num1.setText(String.valueOf(data1));
        num2.setText(String.valueOf(data2));

        //Declaring operation Buttons
        Button button01 = findViewById(R.id.button1);
        Button button02 = findViewById(R.id.button2);
        Button button03 = findViewById(R.id.button3);
        Button button04 = findViewById(R.id.button4);

        //calling the relevant functions for each button.
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Substract();
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply();
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide();
            }
        });

    }


 // Addition function
    public void Add(){
        EditText num1 = findViewById(R.id.numone);
        EditText num2 = findViewById(R.id.numtwo);
        EditText result = findViewById(ResultView);

        double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());

        double answer = number1 + number2;
        result.setText("Your addition: "+ answer);


    }

    // substraction function
    public void Substract(){
        EditText num1 = findViewById(R.id.numone);
        EditText num2 = findViewById(R.id.numtwo);
        EditText result = findViewById(ResultView);

        double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());

        double answer = number1 - number2;
        result.setText("Your subtraction: "+ answer);



    }

    // Multiplication function
    public void Multiply(){

        EditText num1 = findViewById(R.id.numone);
        EditText num2 = findViewById(R.id.numtwo);
        EditText result = findViewById(ResultView);

        double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());

        double Answer = number1 * number2;
        result.setText("Your Multiplication: "+ Answer);
    }

    //Division function
    public void Divide(){

        EditText num1 = findViewById(R.id.numone);
        EditText num2 = findViewById(R.id.numtwo);
        EditText result = findViewById(ResultView);

        double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());

        double Answer = number1 / number2;
        result.setText("Your Division: "+ Answer);

    }




}
