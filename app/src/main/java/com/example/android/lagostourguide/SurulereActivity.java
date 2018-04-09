package com.example.android.lagostourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SurulereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //Array of string locations
        ArrayList<Location> locations = new ArrayList<Location>();



        locations.add(new Location("National Arts Theatre",R.drawable.national_arts_theatre,"The National Arts Theatre is the primary centre for the performing" +
                " arts in Nigeria. The monument is located in Iganmu, Surulere, Lagos. Its construction was completed in 1976 in preparation " +
                "for the Festival of Arts and Culture (FESTAC) in 1977. The collection of National Gallery of Modern Nigerian Art is housed in " +
                "a section of this building."));

        locations.add(new Location("National Stadium, Lagos",R.drawable.national_stadium_lagos,"The Lagos National Stadium is a multi-purpose " +
                "stadium in Surulere, Lagos State, Nigeria, which comprises an Olympic-size swimming arena and a multipurpose arena used for " +
                "basketball, volleyball, table tennis, wrestling and boxing matches. It was used mostly for football matches until 2001. " +
                "It hosted several international competitions including the 1980 African Cup of Nations final, the 2000 African Cup of Nations " +
                "final, and FIFA World Cup qualifying matches. It also served as the main stadium for the 1973 All-Africa Games. It was closed " +
                "and abandoned in the year 2004."));

        locations.add(new Location("Leisure Mall",R.drawable.leisure_mall_surulere,"Located in a serene environment in the heart of Lagos Mainland, " +
                "Surulere, Leisure Mall, at Adeniran Ogunsanya street, is one of the best places in Nigeria to go to for leisure, fun and shopping. " +
                "Leisure mall is first and foremost a large shopping mall that hosts a lot of top brand retail stores and businesses that offer various " +
                "services and products which attract a lot of people on a daily basis."));

        locations.add(new Location("The Ayo Bankole Centre for arts and cultural expression",R.drawable.ayo_bankole,"For lovers of music, The Ayo Bankole Centre " +
                "for Arts and Cultural Expression is worth a visit. Situated in Surulere, a popular suburb on the city’s mainland, it holds a monthly " +
                "jazz and “old skool” classics evening on the last weekend of every month. In addition to the resident band, various Nigerian and " +
                "International acts perform live, treating visitors to jazz performances and classic hits across various genres. "));




        //Array adapter
        LocationAdapter locationsAdapter = new LocationAdapter(this,locations);

        //Find list view and set the adapter
        ListView listView = (ListView) findViewById(R.id.location_list);
        listView.setAdapter(locationsAdapter);



    }
}
