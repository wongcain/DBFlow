package com.raizlabs.android.dbflow.test.typeconverter;

import android.location.Location;
import com.raizlabs.android.dbflow.converter.TypeConverter;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description:
 */
@com.raizlabs.android.dbflow.annotation.TypeConverter
public class LocationConverter extends TypeConverter<String, Location> {
    @Override
    public String getDBValue(Location model) {
        return String.format("%1s,%1s", model.getLatitude(), model.getLongitude());
    }

    @Override
    public Location getModelValue(String data) {
        String[] values = data.split(",");
        Location location = new Location("");
        location.setLatitude(Double.valueOf(values[0]));
        location.setLongitude(Double.valueOf(values[1]));
        return location;
    }
}
