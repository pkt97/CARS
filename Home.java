package com.example.cars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView text=(TextView)findViewById(R.id.scroll);
        text.setMovementMethod(new ScrollingMovementMethod());
    }

    public void login(View view)
    {
        TextView t= (TextView)findViewById(R.id.b1);
        Intent i= new Intent(this,Login.class);
        startActivity(i);
    }
    public void register(View view)
    {
        TextView t=(TextView)findViewById(R.id.b2);
        Intent i= new Intent(this, Register.class);
        startActivity(i);
    }

}
