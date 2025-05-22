package com.ps;

import com.ps.core.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    public static void writeReceipt(TravelAgency travelAgency, Trip trip) {
        // receipt_2394623762837
        Instant now = Instant.now();
        long epochSeconds = now.getEpochSecond();
        String formattedTimestamp = String.format("receipt_%d.csv", epochSeconds);
        try (
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(formattedTimestamp, true));
        ){

            // Destinations: NYC Tokyo
            String formattedDestinations = "";
            for(Destination destination: trip.getDestinations()){
                formattedDestinations += destination.getCityName() + " ";
            }

            String formattedActivities = "";
            for(String activity: trip.getActivities()){
                formattedActivities += activity + " ";
            }

            String formattedAddOns =  "";
            for(AddOn addOn: trip.getAddOns()){
                if(addOn instanceof Hotel){
                    formattedAddOns += "Hotel ";
                } else if(addOn instanceof Transportation){
                    formattedAddOns += "Transportation ";
                } else {
                    formattedAddOns += "Insurance ";
                }
            }

            double total = trip.calcPrice();

            bufferedWriter.write(String.format(
                    "Receipt Id: %s\n" +
                    "Name: %s\n" +
                    "Address: %s\n" +
                    "Phone: %s\n" +
                    "Customer Name: %s\n" +
                    "Destinations: %s\n" +
                    "Activities: %s\n" +
                    "Add Ons: %s\n" +
                    "Total Price: %.2f\n",
                    formattedTimestamp,
                    travelAgency.getName(),
                    travelAgency.getAddress(),
                    travelAgency.getPhone(),
                    trip.getCustomerName(),
                    formattedDestinations,
                    formattedActivities,
                    formattedAddOns,
                    total
            ));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
