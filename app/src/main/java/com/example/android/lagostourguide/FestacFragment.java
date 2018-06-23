package com.example.android.lagostourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class FestacFragment extends Fragment {

    public FestacFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Array of string locations
        ArrayList<Location> locations = new ArrayList<Location>();



        locations.add(new Location("Golden Tulip Festac",R.drawable.golden_tulip_festac,"Golden Tulip Festac Lagos is a 4-Star hotel situated " +
                "along Amuwo Odofin, Mile 2, Festac, Lagos. It is characterised by a breathtaking architectural design and mind-blowing services " +
                "and facilities which culminate in maximum satisfaction for guests. It is closely situated to the popular Festival Mall, which is" +
                " a favourite for fun lovers"));

        locations.add(new Location("Festival Mall",R.drawable.festival_mall,"Festival Mall was established in 2015 to service the demand " +
                "for modern retail space in the Festac Town axis. It is notable as the first mixed estate development model of its kind in Lagos. " +
                "With the establishment of this entertainment centre, residents of the Festac region no longer have to journey and face Lagos " +
                "traffic to experience a shopping mall."));

        locations.add(new Location("Funtastica land",R.drawable.funtastica_land,"Funtastica land consist of family rides, such as kiddy’s ride, " +
                "Merry-go-round, trackless train, video game arcade, Bouncy Castles, Playzone, 6D cinema, fun foods kiosks, Party shop, instant photo " +
                "booth, dance machine and a Party hall."));


        //Array adapter

        LocationAdapter locationsAdapter = new LocationAdapter(getActivity(),locations);

        //Find list view and set the adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationsAdapter);


        return rootView;
    }


}
