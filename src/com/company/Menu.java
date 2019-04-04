package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    Time timer = new Time();
    ArrayList<Taxi> taxiAList;
    TaxiList taxiList = new TaxiList();
    Scanner scanner = new Scanner(System.in);




    public void consoleInterface() {

        int valg;

        System.out.println("Welcome to Damn Fast Taxis");
        System.out.println();
        System.out.println("(1) Start a taxi");
        System.out.println("(2) Stop a taxi");
        System.out.println("(3) Pause a ride");
        System.out.println("(4) Ask for price");
        System.out.println("(5) Free ride ");
        System.out.println();
        System.out.println("Choose a <number> and hit \"enter\": ");
        valg = scanner.nextInt();

        switch (valg) {
            case 1:
                startTaxi();
                consoleInterface();

                break;
            case 2:
                stopTaxi();
                timer.Price();

                consoleInterface();
                break;
            case 3:
                consoleInterface();
                break;
            case 4:
                consoleInterface();
                break;
            case 5:
                freeRideEnd();
                consoleInterface();
                break;

        }
    }


    //Metode til at kører taxierne i Arraylisten igennem og printe til consol
    public void taxiList(){
        taxiAList = taxiList.taxiArrayList;
        System.out.println("List of all Damn Fast Taxis:");
        for (int i = 0; i < taxiAList.size(); i++) {
            System.out.println("Taxi ID: " + taxiAList.get(i).getTaxiID() + " Taxi Driver: " + taxiAList.get(i).getTaxiDriver());

        }
    }


    //Metode til at vælge hvilken taxi der skal kører.
    public void startTaxi() {

        taxiList();
        System.out.println("Which taxi do u wish to start? Write Taxi ID: ");
        int startTaxiID = scanner.nextInt();
        System.out.println();
        taxiAList = taxiList.taxiArrayList;
        for (int i = 0; i < taxiAList.size(); i++) {
            if (taxiAList.get(i).getTaxiID() == startTaxiID) {

             //   if (valg == 1) {
                    timer.start(startTaxiID);
               // }
                 //       else{
                   //     System.out.println("fejl");
                    }
                    }
//                } else if (valg == 5) {
//
//                    timer.startFreeRide(startTaxiID, true);
//                } else {
//                    System.out.println("fejl");
//                }
//
//            }

        }
    //}

    //Metode til at vælge hvilken taxi der skal stoppe
    public void stopTaxi() {
        taxiList();
        System.out.println("Which taxi do u wish to stop? Write Taxi ID: ");
        int endTaxiID = scanner.nextInt();
        System.out.println();
        taxiAList = taxiList.taxiArrayList;
        for (int i = 0; i < taxiAList.size() ; i++) {
            if (taxiAList.get(i).getTaxiID() == endTaxiID){
                timer.end(endTaxiID);

            }
        }

        }

        //Metode til at stoppe en taxi tur, og gøre hele turen gratis
        public void freeRideEnd() {
            taxiList();
            System.out.println("Which free ride taxi would you like to stop? Write Taxi ID: ");
            int freeRideID = scanner.nextInt();
            System.out.println();
            taxiAList = taxiList.taxiArrayList;
            for (int i = 0; i < taxiAList.size() ; i++) {
                if (taxiAList.get(i).getTaxiID() == freeRideID){
                    timer.freeRidePrice(freeRideID);

                }
            }



    }
}


