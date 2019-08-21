package com.myfleet.scm.Home_page;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;
import com.myfleet.scm.Attendance.Attendance_activity;
import com.myfleet.scm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        MaterialCardView  mc=(MaterialCardView)view.findViewById(R.id.bankcardId);
        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent is=new Intent(getActivity(), Attendance_activity.class);
                startActivity(is);
            }
        });
        return view;
    }

}
