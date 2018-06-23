package com.example.android.lagostourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class IkejaFragment extends Fragment {

    public IkejaFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Array of string locations
        ArrayList<Location> locations = new ArrayList<Location>();



        locations.add(new Location("Barcelos Ikeja",R.drawable.barcelos_ikeja,"The lights and interior are perfectly crafted and " +
                "designed to welcome you with arm’s wide open. Known for the grilled meat and cocktails of all kind, Barcelos is a place with a " +
                "touch of class for those who are looking to impress their dates. Delicious food and a cozy ambiance makes for an ideal date " +
                "night and that’s what Barcelos offers."));

        locations.add(new Location("Melting Moments",R.drawable.melting_moments,"This is a place where you get all sorts of ice cream. It’s not " +
                "just known for ice cream but the aura that this place provides and the welcome is extraordinary and perfect for dates. Melting " +
                "point is located in the Ikeja City Mall. After all, it is said that everybody loves ice cream. Be adventurous and go for the " +
                "Gelato Smoothie, it is incredibly delicious."));

        locations.add(new Location("Rhapsody’s",R.drawable.rhapsodys,"Rhapsody’s has a gorgeous ambience. Located in Ikeja City Mall in Alausa, " +
                "Ikeja, the restaurant is known for its romantic settings, a perfect place for a date. You are going to enjoy a lovely afternoon " +
                "or evening with their overall fine food and service. Instead of settling for a fruit juice, you can woo your crush with a " +
                "exquisite wine from their vast wine list. If you love seafood, you will certainly enjoy your date."));


        //Array adapter
        LocationAdapter locationsAdapter = new LocationAdapter(getActivity(),locations);

        //Find list view and set the adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationsAdapter);


        return rootView;
    }


}
