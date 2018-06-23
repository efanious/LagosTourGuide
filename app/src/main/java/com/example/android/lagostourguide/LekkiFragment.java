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


public class LekkiFragment extends Fragment {

       public LekkiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Array of string locations
        ArrayList<Location> locations = new ArrayList<Location>();



        locations.add(new Location("Xovar Lounge",R.drawable.xovar_lounge,"Xovar lounge is a place that’s designed to suit almost every " +
                "type of person. It is located at 19B Sabitex Hotel Drive, opposite House on the Rock, 4th Lekki roundabout, Lekki " +
                "Expressway. Its architectural design is structured to make guests feel relaxed and loved. No need to stress yourself, " +
                "you and your partner can just dress casually. Sit in any one of the elegant seats and make your pick out of the " +
                "excellent list of drinks and food. There are different dining areas in Xovar lounge: inner lounge, outer lounge, the " +
                "outdoor bar and the terrace. You could stay in any part that’s convenient for you and your date. This place is open all " +
                "day but on Sunday, a special buffet is served from 1-5pm."));

        locations.add(new Location("Elegushi beach",R.drawable.elegushi_beach,"This is a white sand beach situated in Ikate area of Lekki." +
                " You will be required to pay an entrance fee of N1000. You should dress light and casual so that you can feel the soft " +
                "caress of the sea breeze and enjoy loafing around the beach. The restaurants there are classy ones and you will love the " +
                "local meals like the fish pepper soup served there. There are usually live performances on the beach all through the " +
                "week. The fun you will have at Elegushi beach is incomparable."));

        locations.add(new Location("Lekki Conservation Centre",R.drawable.lekki_conservation_centre,"This is a reserve where you will see " +
                "various kinds of animals, ranging from mammals to reptiles. Lekki conservation centre is at KM 19, Lagos-Epe expressway, " +
                "by 2nd toll gate, Lekki, Lagos. The amazing views and the wide variety of activities you and your date could indulge " +
                "yourselves in will remain memorable for you guys. The place has facilities like beach volleyball courts & spectators’ " +
                "pavilion, tree houses, jungle gym facilities like monkey bars, zip lines etc, Koi & Tilapia ponds, nature station, " +
                "barbecue joints, floor games, 96-seater Gazebos and many more. With a token entrance fee of N1000, you and your partner " +
                "could enter a world of laughter and excitement."));

        locations.add(new Location("Abe-Igi Bar and Grill",R.drawable.abe_igi_bar_and_grill,"Abe-Igi is a small suya spot at Hedge & Smith " +
                "Plaza, Admiralty Way(E), Lekki phase 1. You could spend just N5000 having fun and sampling the delicious kebabs and " +
                "barbecues prepared in this local environment. It is open every evening from 4:00 pm to 11:00 pm. If your partner is the " +
                "type that loves traditional settings and the smell of roasting meat, then this is the best place to have a lovely time " +
                "with him/her."));

        locations.add(new Location("The Palms Shopping Mall, Lekki",R.drawable.the_palms_shopping_mall,"A lot of fun things to do in one place" +
                " is the best way to describe The Palms Shopping Mall. You could watch movies at the Genesis Deluxe Cinema, wine and dine in " +
                "the top-notch restaurants like the premium Gourmet restaurant, shop for fashion items in any of the clothing stores like " +
                "Mango etc. It is located at 1 BIS way, Lekki Peninsula Phase 1, Eti Osa, Lagos."));

        locations.add(new Location("Nike’s Art Gallery",R.drawable.nike_art_gallery,"This is one of the largest art galleries in West Africa where" +
                " you will find a captivating display of Nigerian arts and culture. It is located at no 2 Elegushi road, Lagos and usually " +
                "open from 10:00 am to 6:00 pm. You could make a good impression by taking your date to this place that’s rich with African " +
                "artworks ranging from pieces of jewelry to fabrics. What’s more? You don’t pay a dime. Entry is totally free."));

        locations.add(new Location("Filmhouse Imax Cinemas",R.drawable.filmhouse_imax_cinemas,"Filmhouse Imax cinemas is a big cinema located at " +
                "The Rock Drive, Lekki phase1, Lagos. This would be the best place to go for a date in Lekki if your partner is a movie " +
                "lover. You get to watch trending movies on a massive screen in very clear and high resolution that will blow your mind away. " +
                "You could also chill out at the all VVIP signature bar or the exclusive terrace bar."));

        locations.add(new Location("The Pavillion",R.drawable.the_pavillion,"Are you looking to experience the feeling of cosying up in an open " +
                "space while taking in the beautiful view around and also make merry with delicious meals and drinks? Then The Pavilion is " +
                "the answer to your needs. It is located at  Lekki Phase 1, 16A Admiralty way(E), Lekki, Nigeria. In this cool hangout " +
                "spot, you will enjoy tasty pepper soup and have any drink of your choice while enjoying the grand view of the Ikoyi and " +
                "Lekki bridge."));

        locations.add(new Location("Bay Lounge",R.drawable.bay_lounge,"Waterfront entertainment in a romantic and relaxing environment is what" +
                " you experience when you pick Bay Lounge as your date venue. It is situated at plot 10, 12B, Admiralty Road, Lekki Phase 1, " +
                "Lagos. The Bay Lounge is open from 11:00 am and costs approximately N9,500 for two persons. At the Bay Lounge, you can order " +
                "various cuisines like grilled food, burger, sandwiches and barbecue. You will enjoy listening to the cool music- both high " +
                "life and soft blues, played by the live band while also feeling the cool breeze of the sea."));

        locations.add(new Location("La Campagne Tropicana",R.drawable.la_campagne_tropicana,"This is a resort that ushers you into a " +
                "natural world surrounded by a Savannah, a freshwater lake, accessible mangrove forest, the tepid Atlantic sea and the " +
                "widespread sandy beach. La Campagne Tropicana has its location at Ikegun, Ibeju-Lekki local govt. the area off Lekki/Epe" +
                " Expressway. You need not fear about encountering any hazard, it is secure round the clock. The plush holiday homes have " +
                "lavish furnishings and are decorated in African style. You could engage yourself in exciting activities like ocean water " +
                "fishing, soccer, beach volleyball, hiking, canoeing, hunting, horse riding and aqua aerobics. So you should pack clothing " +
                "suitable for these sort of activities like sneakers, trousers and vest. Entrance fee costs N2000 per head."));

        locations.add(new Location("The Place Restaurant & Bar",R.drawable.the_place_restaurant_and_bar,"This is a cool place to hang out at night with" +
                " your date. It perfectly merges a restaurant, bar and a nightclub in a single spot. By night it serves as a lounge with a " +
                "welcoming atmosphere and by day it is a restaurant. The address for the Place Restaurant & Bar is plot 3B, Block A10, " +
                "Admiralty Way, Lekki Estate Phase 1.  At the Place Restaurant & Bar; you will enjoy local dishes including grills and " +
                "barbecues. Cool music also blasts out of their speakers every evening except on Sundays when there are live performances."));

        locations.add(new Location("GET Arena",R.drawable.get_arena,"This is a popular attraction in Lekki. It is located at plot 6, Abiola Oniru " +
                "Estate, Lekki, Eti Osa, Lagos. There is a lot of fun to be had here as there is ample space for different kinds of recreational activities " +
                "like football, table tennis etc. The place also boasts of facilities like swimming pool, gym and free WiFi. There are restaurants and bar on " +
                "the arena that offers a variety of dining options and different kinds of drinks. GET arena is open every day from 8:00 am."));

        locations.add(new Location("Domino’s Pizza",R.drawable.dominos_pizza,"Domino’s Pizza is a leading pizza restaurant chain in the world. It can " +
                "also be found in Lekki at 69 Admiralty Way (E),  Lekki phase 1, Lagos. It is also one of the coolest places to hang out with your date " +
                "in Lekki.  The approximate cost for two persons is N6000. Domino’s Pizza is open from 9:00 am to 10:00 pm every day except Thursday, Friday " +
                "and Saturday when it opens from 9:00 am to 12:00 am."));

        locations.add(new Location("Sailors Lounge",R.drawable.sailors_lounge,"This is another waterfront hangout spot in Lekki. It is located at plot " +
                "1 Block 12, admiralty road, Lekki Phase 1. The big shack that’s Sailor’s lounge is on top of the water and was built from " +
                "Bamboo. There are three sections in the lounge—Captain’s cabin; Captain’s Deck and Sailor’s Bar. The Sailor’s lounge, " +
                "just like any other good bar, offers a variety of drinks e.g. cocktails, beer etc. It also serves different kinds of cuisine " +
                "ranging from intercontinental to seafood. The Sailor’s lounge features outdoor seating, bar/lounge and live music. The approximate " +
                "cost for two persons is N15,000."));

        locations.add(new Location("Marcopolo Chinese",R.drawable.marco_polo,"This is a restaurant that offers only Chinese cuisine. It is a perfect spot " +
                "for a lunch or dinner date in Lekki. It is located at 10, Admiralty Way, Lekki Phase 1, Lagos. Marcopolo Chinese also features a " +
                "bar/lounge. The approximate cost for two persons is N8000. Its opening hours are 12:00 pm to " +
                "11:00 pm from Monday to Sunday."));


        //Array adapter

        LocationAdapter locationsAdapter = new LocationAdapter(getActivity(),locations);

        //Find list view and set the adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationsAdapter);


        return rootView;
    }

}
