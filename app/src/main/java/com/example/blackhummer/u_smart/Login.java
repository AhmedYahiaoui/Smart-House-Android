package com.example.blackhummer.u_smart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button btncontinue ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btncontinue= findViewById(R.id.btncontinue);

        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivtiy();
            }
        });
    }


    public void openLoginActivtiy(){
        Intent intent = new Intent(this,LoginAfter.class);
        startActivity(intent);

    }
}
