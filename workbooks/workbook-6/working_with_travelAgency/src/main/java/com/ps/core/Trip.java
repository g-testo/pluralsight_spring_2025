package com.ps.core;

import java.util.List;

public class Trip implements Product{
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

    public Trip() {}

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

    public double calcPrice(){
        return 0;
    }

    public void generateItinerary(){

    }

    public void generateReceipt(){

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
