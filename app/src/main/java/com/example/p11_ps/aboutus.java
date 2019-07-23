package com.example.p11_ps;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class aboutus extends AppCompatActivity {

    ActionBar ab;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        iv = findViewById(R.id.ivP);
        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        Picasso.with(this)
                .load(imageUrl)
                .error(R.drawable.ic_error_black_24dp)
                .placeholder(R.drawable.ajax_loader)
                .into(iv);

    }
}