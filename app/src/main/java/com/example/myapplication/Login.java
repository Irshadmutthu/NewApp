package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

String un="Admin";
 String pw="abc123";
//    EditText username,password;
  Button cancel;
    EditText username,password;
    TextView logintexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText) findViewById(R.id.usrname);
        password=(EditText) findViewById(R.id.pswd);
//        username=(EditText) findViewById(R.id.usrname);
//        password=(EditText) findViewById(R.id.pswd);
     cancel=(Button) findViewById(R.id.cancelbutton);
       cancel.setOnClickListener(this);

       //here iam adding animation to the login text
        logintexts=(TextView) findViewById(R.id.logintext);
        Animation blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        logintexts.startAnimation(blink);

//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        }); Another methode
    }

//    public void LoginClick(View view) {
//
//        String uname=username.getText().toString();
//        String pword=password.getText().toString();
//        if(uname.equals(un)&&pword.equals(pw)){
//            Intent i=new Intent(getApplicationContext(),Homepage.class);
//            startActivity(i);
//        }
//        else{
//            Toast.makeText(getApplicationContext(),"Check password or username",Toast.LENGTH_LONG).show();
//        }
//
//
//    }


    @Override
    public void onClick(View view) {
        finish();
    }

    public void Login(View view) {
        String usrnamee=username.getText().toString();
        String pswword=password.getText().toString();
        if(usrnamee.equals(un)&&pswword.equals(pw)){
            Intent i=new Intent(getApplicationContext(),Homepage.class);
            startActivity(i);

        }
        else{
            Toast.makeText(getApplicationContext(),"username or Password error",Toast.LENGTH_LONG).show();
        }
    }
}