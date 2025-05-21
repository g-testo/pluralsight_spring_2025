package com.ps.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelAgency {
    private String name;
    private String address;
    private String phone;

    private List<Destination> offeredDestinations = Arrays.asList(
            new Destination("NYC", 3),
            new Destination("London", 3),
            new Destination("Singapore", 3),
            new Destination("Roma", 2),
            new Destination("Rio De Janeiro", 2),
            new Destination("Japan", 2),
            new Destination("Orlando", 1)
    );

    private List<String> offeredActivities = Arrays.asList(
            "Jet Skiing",
            "Hiking",
            "Snorkeling"
    );

    List<Trip> reservations = new ArrayList<>();

    public TravelAgency() {}

    public TravelAgency(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Destination> getOfferedDestinations() {
        return offeredDestinations;
    }

    public List<String> getOfferedActivities() {
        return offeredActivities;
    }

    public List<Trip> getReservations() {
        return reservations;
    }

    public void addReservation(Trip trip) {
        this.reservations.add(trip);
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", offeredDestinations=" + offeredDestinations +
                ", offeredActivities=" + offeredActivities +
                ", reservations=" + reservations +
                '}';
    }
}
