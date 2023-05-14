package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random;
    public void findNumber(View view){
        EditText editText=(EditText)findViewById(R.id.editText);
        String noEntered=editText.getText().toString();
        int no=Integer.parseInt(noEntered);

        String c;
        if(random>no)
            c="Enter a higher value";
        else if(random<no)
            c="Enter a lower value";
        else
            c="You got that right!!!!";
        Toast.makeText(this,c,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        random = rand.nextInt(20)+1;
    }
}