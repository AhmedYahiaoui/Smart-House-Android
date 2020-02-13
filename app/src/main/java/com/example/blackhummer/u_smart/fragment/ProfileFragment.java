package com.example.blackhummer.u_smart.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.blackhummer.u_smart.House.BedRoom;
import com.example.blackhummer.u_smart.ProfileManagment.Profile;
import com.example.blackhummer.u_smart.R;

public class ProfileFragment extends Fragment {

    CardView profile;



    public ProfileFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.userlayout, container, false);

        CardView bed = view.findViewById(R.id.profile);

        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Profile.class);
                startActivity(intent);
            }
        });


        return view ;


    }
}
