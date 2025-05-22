package com.ps;

import com.ps.core.TravelAgency;
import com.ps.core.Trip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;

public class FileManager {
    public static void writeReceipt(TravelAgency travelAgency, Trip trip){
        // receipt_2394623762837
        Instant now = Instant.now();
        long epochSeconds = now.getEpochSecond();

        String formattedTimestamp = String.format("receipt_%d.csv", epochSeconds);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(formattedTimestamp));

            bufferedWriter.write(String.format(
                    "Receipt Id: %s" +
                    "Name: %s\n" +
                    "Address: %s\n" +
                    "Phone: %s\n" +
                    "Customer Name: %s\n" +
                    "Destinations: %s" +
                    "Activities: %s" +
                    "Total Price: %d",
                    formattedTimestamp,
                    travelAgency.getName(),
                    travelAgency.getAddress(),
                    travelAgency.getPhone(),
                    trip.getCustomerName(),
                    trip.getDestinations().toString(),
                    trip.getActivities().toString(),
                    0
            ));

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
