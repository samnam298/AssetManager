package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add Houses
        myAssets.add(new House("My House", "2020-06-12", 250000,
                "123 Main St", 1, 2000, 6000));
        myAssets.add(new House("Vacation Home", "2018-09-10", 320000,
                "555 Beach Rd", 2, 1800, 8000));

        // Add Vehicles
        myAssets.add(new Vehicle("Tom’s Truck", "2021-04-01", 40000,
                "Toyota Tacoma", 2021, 45000));
        myAssets.add(new Vehicle("My Sedan", "2015-03-14", 25000,
                "Honda Accord", 2015, 120000));

        // Loop and print details
        for (Asset asset : myAssets) {
            String message = "";

            if (asset instanceof House) {
                House house = (House) asset;
                message = "House at " + house.getAddress();
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            System.out.println(asset.getDescription() + " acquired " + asset.getDateAcquired()
                    + " for $" + asset.getOriginalCost()
                    + " | Current Value: $" + asset.getValue()
                    + " | " + message);
        }
    }
}
