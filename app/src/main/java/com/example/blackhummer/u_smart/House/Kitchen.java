package com.example.blackhummer.u_smart.House;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.blackhummer.u_smart.R;
import com.example.blackhummer.u_smart.fragment.ControlFragment;

public class Kitchen extends AppCompatActivity {

    ImageView back ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitchen_layout);

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
