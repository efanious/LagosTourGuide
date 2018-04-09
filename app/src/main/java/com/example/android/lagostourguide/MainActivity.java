package com.example.android.lagostourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the lekki locations
        TextView lekkiLocations = (TextView) findViewById(R.id.lekki);

        // Set a click listener on the Lekki View
        lekkiLocations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Lekki text view is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LekkiActivity}
                Intent lekkiIntent = new Intent(MainActivity.this, LekkiActivity.class);

                // Start the new activity
                startActivity(lekkiIntent);
            }
        });

        // Find the View that shows the Surulere locations
        TextView surulereLocations = (TextView) findViewById(R.id.surulere);

        // Set a click listener on the Surulere View
        surulereLocations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Surulere is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SurulereActivity}
                Intent surulereIntent = new Intent(MainActivity.this, SurulereActivity.class);

                // Start the new activity
                startActivity(surulereIntent);
            }
        });

        // Find the View that shows the Ikeja locations
        TextView ikejaLocations = (TextView) findViewById(R.id.ikeja);

        // Set a click listener on the Ikeja View
        ikejaLocations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Ikeja is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link IkejaActivity}
                Intent ikejaIntent = new Intent(MainActivity.this, IkejaActivity.class);

                // Start the new activity
                startActivity(ikejaIntent);
            }
        });

        // Find the View that shows the Festac locations
        TextView festacLocations = (TextView) findViewById(R.id.festac);

        // Set a click listener on the Festac View
        festacLocations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Festac is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FestacActivity}
                Intent festacIntent = new Intent(MainActivity.this, FestacActivity.class);

                // Start the new activity
                startActivity(festacIntent);
            }
        });
    }
}
