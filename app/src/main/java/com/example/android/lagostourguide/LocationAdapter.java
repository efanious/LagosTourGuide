package com.example.android.lagostourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Efana on 2/28/2018.
 */

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(@NonNull Context context, @NonNull List<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being resused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        // Get the location object located at this position in the list
        Location currentLocation = getItem(position);

        //Find the name of location textView in the list_item.xml
        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);

        //Sets this text on the location name textview
        locationName.setText((currentLocation.getLocationName()));



        //Find the location imageView in the list_item.xml
        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.location_image);

        //Sets the image on the location imageview
        locationImage.setImageResource(currentLocation.getLocationImageId());

        //Find the name of description textView in the list_item.xml
        TextView locationDescription = (TextView) listItemView.findViewById(R.id.location_description);

        //Sets this text on the location description textview
        locationDescription.setText((currentLocation.getLocationDescription()));




        return listItemView;
    }
}
