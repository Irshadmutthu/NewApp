package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        EditText texturl=(EditText) findViewById(R.id.url_text);
        Button gotobutton=(Button) findViewById(R.id.goto_button);
        gotobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=texturl.getText().toString();
                Intent obj=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www."+data+".com"));
                startActivity(obj);
            }
        });
    }
}