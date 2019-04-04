package com.company;

import java.util.ArrayList;

public class Time {


    private double pricePerSecond = 2.25;
    private double freeRidePrice = 0.0;


    private long startTime;
    private long endTime;
    private long driveTime;



    private int startTaxiID;

    private boolean isPaused = false;
    private boolean freeRide = false;


//    public void startFreeRide(int startTaxiID, boolean freeRide) {
//        if (freeRide) {
//            this.freeRide = freeRide;
//            startTime = System.currentTimeMillis();
//            System.out.println("Start free ride " + startTaxiID + " starts");
//        }

  //  }

    public void start(int startTaxiID) {


        this.startTaxiID = startTaxiID;
        System.out.println("Taxi number " + startTaxiID + " starts");
        startTime = System.currentTimeMillis();

    }

    public void end(int endTaxiID) {


        System.out.println("Taxi number " + endTaxiID + " ends");
        Time t = new Time();
        endTime = System.currentTimeMillis();

    }


    public void pause() {

    }

    public long elapsedTime() {
        return (endTime - startTime) / 1000;
    }


    public void Price() {

            System.out.println();

            System.out.println(" Your price is: " + elapsedTime() * 2.25);
            System.out.println("Your time is: " + elapsedTime() + " seconds");


    }

    public void freeRidePrice(int freeRideID){
        System.out.println();
        endTime = System.currentTimeMillis();
        System.out.println(" Your price is: " + elapsedTime() * 0.0);
        System.out.println("Your time is: " + elapsedTime() + " seconds");
    }

}






