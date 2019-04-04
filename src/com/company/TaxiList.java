package com.company;

import java.util.ArrayList;

public class TaxiList {

public ArrayList<Taxi> taxiArrayList;


// Her er listen over de eksisterende taxis, og her kan der tilføjes flere.
    // taxiID og taxiDriver kommer fra Taxi class.
public TaxiList(){
    taxiArrayList = new ArrayList<Taxi>();
    taxiArrayList.add(new Taxi(0,"Mie"));
    taxiArrayList.add(new Taxi(1,"Susanne"));
    taxiArrayList.add(new Taxi(2,"Ole"));
    taxiArrayList.add(new Taxi(3,"Mia"));
//    taxiArrayList.add(new Taxi(4,"Carsten"));
//    taxiArrayList.add(new Taxi(5,"Saxo"));
//    taxiArrayList.add(new Taxi(6,"Jonas"));
//    taxiArrayList.add(new Taxi(7,"Daniel"));
//    taxiArrayList.add(new Taxi(8,"Hardy"));
//    taxiArrayList.add(new Taxi(9,"Bo"));
}

}
