package com.example.alumno.clase2turco;


import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick (View v)
    {


        if (v.getId() == R.id.btn1)
        {
            Log.d("Click","Se hizo click en btn 1");
            Button b= (Button) v;
            b.setText("Se hizo Click sobre el btn");

        }else

            Log.d("Click","Se hizo click en btn 2");
        Button b= (Button) v;
        b.setText("Se hizo Click sobre el btn");
    }

}
