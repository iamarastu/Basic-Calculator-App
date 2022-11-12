package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    EditText editTextNumber,editTextNumber2;
    Button button,button2,button3,button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        textView2 = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);


//Add Logic
        button.setOnClickListener(view -> {


            String s1=editTextNumber.getText().toString();
            String s2=editTextNumber2.getText().toString();
            double n1 = Double.parseDouble(s1);
            double n2 = Double.parseDouble(s2);

            double result = n1+n2;

            //displaying text
              String a=""+result;
            textView2.setText(a);
       });
//Subtract logic
        button2.setOnClickListener(view -> {
            String i1 = editTextNumber.getText().toString();
            String i2 = editTextNumber2.getText().toString();
            System.out.println(i1);
            System.out.println(i2);

             int n1 = Integer.parseInt(i1);
             int n2 = Integer.parseInt(i2);
            System.out.println(n1);
            System.out.println("This is n2:"+n2);

              int result = n1-n2;

            //displaying text
            String s  = "" + result;


            textView2.setText( s);
        });

//Divide logic
        button3.setOnClickListener(view -> {
            String i1 = editTextNumber.getText().toString();
            String i2 = editTextNumber2.getText().toString();

            double n1 = Double.parseDouble(i1);
            double n2 = Double.parseDouble(i2);

             double result = n1/n2;

            //displaying text

            textView2.setText(""+result);
        });
//Multiply logic
        button4.setOnClickListener(view -> {
            String i1 = editTextNumber.getText().toString();
            String i2 = editTextNumber2.getText().toString();

            double n1 = Double.parseDouble(i1);
            double n2 = Double.parseDouble(i2);

            double result = n1*n2;

            //displaying text

            textView2.setText(""+ result);
        });


    }







}