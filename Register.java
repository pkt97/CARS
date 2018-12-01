package com.example.cars;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.TextUtils.isEmpty;
import static java.util.regex.Pattern.matches;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    public void nameValid(View view){
        EditText e=(EditText)findViewById(R.id.name);
        String name="a-zA-Z";
        if(isEmpty(name)) {
            e.setError("Name field is required");
        }
        if(!(e.getText().toString().matches(name))){
            e.setError("Only alphabets are allowed");
        }

    }

    public void mobileValid(View view){
        EditText f=(EditText)findViewById(R.id.mobile);
        String mobpat="[0-9]{10}";
        if(isEmpty(mobpat)){
            f.setError("Mobile number is required");
        }
        if(!(f.getText().toString().matches(mobpat))){
            f.setError("Enter valid mobile number");
        }
    }

    public void emailValid(View view){
        EditText g=(EditText)findViewById(R.id.email);
        String emailPat = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if(!(g.getText().toString().matches(emailPat))){
            g.setError("Enter valid email address");
        } }

    public void userValid(View view){
        EditText h=(EditText)findViewById(R.id.username);
        String user=h.getText().toString();
        if(isEmpty(user)){
            h.setError("Username field is required");
        }
    }
    String passw="[a-zA-Z0-9@!#$%^&*()]{8}";
    String passw1="[a-zA-Z0-9@!#$%^&*()]{8}";

    public void passValid(View view){
        EditText j=(EditText)findViewById(R.id.pass);
        if(isEmpty(passw)){
            j.setError("Password field is required");
        }
        if(!(j.getText().toString().matches(passw))){
            j.setError("Password should contain capital, small letters, numbers and special characters");
        }
    }

    public void confpassValid(View view){
        EditText k=(EditText)findViewById(R.id.confirmpass);

        if(isEmpty(passw1)){
            k.setError("Confirm password field is required");
        }
        if(!(k.getText().toString().matches(passw))){
            k.setError("Passwords do not match");
        }
    }
    public void login(View view) {
        TextView t=(TextView) findViewById(R.id.log);
        Intent i= new Intent(this,Login.class);
        startActivity(i);
    }
    public void home(View view){
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }
}
