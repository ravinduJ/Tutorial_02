package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    //Declaring variables.
    private EditText firstinput;
    private EditText secondinput;
    private Button btnone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        firstinput = (EditText) findViewById(R.id.numone);
        secondinput = (EditText) findViewById(R.id.numtwo);
        btnone = (Button) findViewById(R.id.button_submit);

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Display button click message
//                Toast.makeText(getApplicationContext(),"OK Button is just clicked",Toast.LENGTH_LONG).show();
                // Navigate to Second activity page when button was clicked.
                OpensecondActivity();
            }
        });
    }

    public void OpensecondActivity(){

        //Navigating to the Second Activity Page.
        Intent intent = new Intent(this, SecondActivity.class);
        //Getting the input
        String data1 = firstinput.getText().toString();
        String data2 = secondinput.getText().toString();

        //passing the inputs to Second Activity
        intent.putExtra("input01", data1);
        intent.putExtra("input02", data2);
        startActivity(intent);
        finish();


        Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        toast.show();
    }
}
