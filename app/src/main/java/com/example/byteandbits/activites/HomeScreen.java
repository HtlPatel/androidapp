package com.example.byteandbits.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.byteandbits.R;

public class HomeScreen extends AppCompatActivity {
Button btncontact,btnAboutus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btncontact=(Button)findViewById(R.id.BtnContact);
        btnAboutus=(Button)findViewById(R.id.BtnAbout);

        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeScreen.this,ContactUs.class);
                startActivity(i);
            }
        });

        btnAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeScreen.this,AboutUs.class);
                startActivity(i);
            }
        });
    }
}
