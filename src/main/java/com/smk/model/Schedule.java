package com.smk.model;

import javax.xml.crypto.Data;

public class Schedule extends Model {
    private long id;
    private long departureId;
    private long arrivalId;
    private Data departureDate;
    private String flightNumber;
}
