package com.shaveshan.tp02_onclickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void event(View view) {
        EditText nbr1 = findViewById(R.id.nbr1);
        EditText nbr2 = findViewById(R.id.nbr2);
        TextView text = findViewById(R.id.text);
        double moy =  Integer.parseInt( nbr1.getText().toString() )*0.5 + Integer.parseInt( nbr2.getText().toString() )*0.5;
        text.setText( String.valueOf(moy));
    }



}
