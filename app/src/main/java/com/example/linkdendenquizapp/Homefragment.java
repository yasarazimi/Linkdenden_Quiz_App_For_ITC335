package com.example.linkdendenquizapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Homefragment extends Fragment {
    CardView HProfile, HNetwork, HPost, HNotification, HJob;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_homefragment, container, false);

        HProfile = view.findViewById(R.id.HProfile);
        HNetwork = view.findViewById(R.id.HNetwork);
        HPost = view.findViewById(R.id.HPost);
        HNotification = view.findViewById(R.id.HNotification);
        HJob = view.findViewById(R.id.HJob);

        HProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHProfile();
            }
        });
        HNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHNetwork();
            }
        });
        HPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHPost();
            }
        });
        HNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHNotification();
            }
        });
        HJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHJob();
            }
        });

        return view;
    }

    public void openHProfile() {
        Intent intent = new Intent(getActivity(), Profile.class);
        startActivity(intent);
    }

    public void openHNetwork() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new NetworkFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void openHPost() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new PostFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void openHNotification() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new Notificationsfragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void openHJob() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new Jobsfragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
