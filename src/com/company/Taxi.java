package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Taxi {

    private int taxiID;
    private String taxiDriver;


    public Taxi(){

    }

    public Taxi(int taxiID, String taxiDriver) {
        this.taxiID = taxiID;
        this.taxiDriver = taxiDriver;
    }


    public int getTaxiID() {
        return taxiID;
    }


    public String getTaxiDriver() {
        return taxiDriver;
    }



    }



