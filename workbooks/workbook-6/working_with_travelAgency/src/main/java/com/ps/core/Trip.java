package com.ps.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.regex.Pattern;

public class Trip implements Product {
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private String dateReserved;
    private String startDate;
    private String endDate;
    private int additionalTravelers;

    private List<Destination> destinations;
    private List<String> activities;
    private List<AddOn> addOns;

    public Trip() {
    }

    public Trip(String customerName, String customerPhone, String customerAddress, String dateReserved, String startDate, String endDate, int additionalTravelers, List<Destination> destinations, List<String> activities, List<AddOn> addOns) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.dateReserved = dateReserved;
        this.startDate = startDate;
        this.endDate = endDate;
        this.additionalTravelers = additionalTravelers;
        this.destinations = destinations;
        this.activities = activities;
        this.addOns = addOns;
    }

    public double calcPrice() {
        List<Product> products = new ArrayList<>();
        // Daily Destinations pricing
        // destinations = Rio(300), toyko(300)

        products.addAll(destinations);

        // Add Ons Pricing
        // Addons = hotel(150), transportation(50)

        products.addAll(addOns);

        double totalDailyPrice = 0;
        for (Product product : products) {
            totalDailyPrice += product.calcPrice();
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        // Start date = 05/25/25
        LocalDate startDate = LocalDate.parse(this.startDate, formatter);

        // End date = 05/30/25
        LocalDate endDate = LocalDate.parse(this.endDate, formatter);

        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        // number of days: 5


        // Travellers = 10
        int allTravelers = additionalTravelers + 1;

        // 1 + additionalTravelers times * daily rate per person pricing * number of days
        // 1 + 10 * (600 + 150 + 50) * 5
        // 11 * (800) * 5

        return allTravelers * totalDailyPrice * numberOfDays;
    }

    public void generateItinerary() {

    }

    public String generateReceipt() {
        return "";
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getDateReserved() {
        return dateReserved;
    }

    public void setDateReserved(String dateReserved) {
        this.dateReserved = dateReserved;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAdditionalTravelers() {
        return additionalTravelers;
    }

    public void setAdditionalTravelers(int additionalTravelers) {
        this.additionalTravelers = additionalTravelers;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public List<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(List<AddOn> addOns) {
        this.addOns = addOns;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", dateReserved='" + dateReserved + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", additionalTravelers=" + additionalTravelers +
                ", destinations=" + destinations +
                ", activities=" + activities +
                ", addOns=" + addOns +
                '}';
    }
}
