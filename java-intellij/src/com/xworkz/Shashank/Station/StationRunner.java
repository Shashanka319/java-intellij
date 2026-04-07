package com.xworkz.Shashank.Station;

public class StationRunner {
    public static void main(String[] args) {
        System.out.println("Information odf the Station");
        MetroStation metroStation = new MetroStation(10,"KSR MetroStation","Jayadev Hospital","RV Colloge Road");
        metroStation.info();
    }
}
