package com.example.blackhummer.u_smart.ProfileManagment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.blackhummer.u_smart.R;

public class Reclamation extends AppCompatActivity {

    ImageView back ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reclamation);
        final FloatingActionButton fab = findViewById(R.id.fab);
      //  final fabMenu = findViewById(R.id.fabMenu);
        ImageView back = (ImageView)findViewById(R.id.back);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }



    @Override
    public void onBackPressed()
    {
        finish();
    }
}