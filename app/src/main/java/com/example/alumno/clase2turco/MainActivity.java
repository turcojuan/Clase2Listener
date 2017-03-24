package com.example.alumno.clase2turco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          TextView tw =(TextView) findViewById(R.id.textV);
            tw.setText("Otro Texto");

        Button btn =(Button) findViewById(R.id.btn1);
        btn.setText("Cambiar texto");

        View.OnClickListener listener = new MyListener();
        btn.setOnClickListener(listener);


    }
}
