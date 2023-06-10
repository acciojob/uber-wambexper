package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripBookingId;

    private String fromLocation;
    private String toLocation;
    private int distanceInKm;
    private int bill;

    @Enumerated(value = EnumType.STRING)
    private TripStatus status;

    @ManyToOne
    @JoinColumn
    Customer customer;

    @ManyToOne
    @JoinColumn
    Driver driver;

    /*public TripBooking(int tripBookingId, String fromLocation, String toLocation, int distanceInKm) {
        this.tripBookingId = tripBookingId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
    }*/

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }
}