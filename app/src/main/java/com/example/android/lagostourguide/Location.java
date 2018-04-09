package com.example.android.lagostourguide;

/**
 * Created by Efana on 2/28/2018.
 */

public class Location {

    //Name of location
    private String mLocationName;

    //Image ID of location
    private int mLocationImageId;

    //Location Description
    private String mLocationDescription;

    //Default Constructor
    public  Location(String location,int imageId, String descriptionOfLocation){
        mLocationName = location;
        mLocationImageId = imageId;
        mLocationDescription = descriptionOfLocation;

    }

    /**
     * Returns the name of the location.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Returns the image Resource ID of the location.
     */
    public int getLocationImageId() {
        return mLocationImageId;
    }

    /**
     * Returns a description of the location.
     */
    public String getLocationDescription() {
        return mLocationDescription;
    }
}
