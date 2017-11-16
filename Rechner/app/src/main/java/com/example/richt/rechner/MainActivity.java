package com.example.richt.rechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DemoIntialApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnDoMagi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "This is a magic log message!");
                Toast.makeText(getApplicationContext(), "Nö!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
    //Addition
    public void myBerechnen(View v) {
        EditText Feld1=(EditText)findViewById(R.id.z1);
        EditText Feld2=(EditText)findViewById(R.id.z2);
        EditText Feld3=(EditText)findViewById(R.id.z3);

        Integer zahl1=Integer.parseInt(Feld1.getText().toString());
        Integer zahl2=Integer.parseInt(Feld2.getText().toString());
        Feld3.setText(String.valueOf(zahl1+zahl2));
    }
    //Subtraktion
    public void minus(View v) {
        EditText Feld1=(EditText)findViewById(R.id.z1);
        EditText Feld2=(EditText)findViewById(R.id.z2);
        EditText Feld3=(EditText)findViewById(R.id.z3);

        Integer zahl1=Integer.parseInt(Feld1.getText().toString());
        Integer zahl2=Integer.parseInt(Feld2.getText().toString());
        Feld3.setText(String.valueOf(zahl1-zahl2));
    }
}
