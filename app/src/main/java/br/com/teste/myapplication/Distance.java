package br.com.teste.myapplication;


import java.text.DecimalFormat;

public class Distance {
    public static double getDistanceInKm(double startLat, double startLng, double endLat, double endLng) {
        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(endLat - startLat);
        double lonDistance = Math.toRadians(endLng - startLng);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(startLat)) * Math.cos(Math.toRadians(endLat))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c; // in Km
        // * 1000 to convert to meters

        double height = 0.0 - 0.0;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
