package com.example.cars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void userValid(View view){
        EditText l=(EditText)findViewById(R.id.userfield);
        String user=l.getText().toString();
        if(isEmpty(user)){
            l.setError("Username field is required");
        }
    }

    public void passValid(View view){
    EditText m=(EditText)findViewById(R.id.passwordfield);
    String pass1=m.getText().toString();
        if(isEmpty(pass1)){
        m.setError("Password field is required");
        }
    }

    public void Registration(View view){
        Intent i=new Intent(this,Register.class);
        startActivity(i);
    }
    public void home(View view){
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }
}
