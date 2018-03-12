package com.srv.track.loginsuccess;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.srv.track.R;
import com.srv.track.service.LocationUpdateCheck;

public class LoginSuccess extends Fragment implements View.OnClickListener{
    Button start,stop;
    public LoginSuccess() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_success, container, false);
        start  = view.findViewById(R.id.btn_start);
        stop = view.findViewById(R.id.btn_stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_start:
                Intent intent = new Intent(getActivity(), LocationUpdateCheck.class);
                getActivity().startService(new Intent(intent));
                break;
            case R.id.btn_stop:
                Intent intent1 = new Intent(getActivity(), LocationUpdateCheck.class);
                getActivity().stopService(intent1);
                break;
        }
    }
}
