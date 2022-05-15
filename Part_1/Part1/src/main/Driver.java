// -----------------------------------------------------
// Part: I
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package main;

import pack1.Airplane;
import pack2.Helicopter;
import pack2.Quadcopter;
import pack3.Multirotor;
import pack4.UAV;
import pack5.AgriculturalDrone;
import pack5.MAV;

/**
 * Driver class to find least and most expensive UAV
 */
public class Driver {

    /**
     * Find least and most expensive UAV
     * @param array
     * @return description string
     */
    public static String findLeastAndMostExpensiveUAV(FlyingObject[] array) {
        int max = -1;
        int min = -1;

        for (int j = 0; j < array.length; j++) {
            if (array[j] instanceof UAV) {
                max = j;
                min = j;
                break;
            }
        }

        if (max == -1 || min == -1) {
            return "No UAVs have been found!";
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] instanceof UAV) {
                    if (array[max].getPrice() < array[i].getPrice()) {
                        max = i;
                    } else if (array[min].getPrice() > array[i].getPrice()) {
                        min = i;
                    }
                } else {
                    continue;
                }
            }
            if (max == min) {
                return "The least and most expensive UAV: " + array[max];
            } else {
                return "The least expensive UAV: " + array[min].toString() + "\nThe most expensive UAV: " + array[max  ].toString();
            }
        }
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        Airplane avia1 = new Airplane("Suzuki", 10000.75, 34);
        Airplane avia2 = new Helicopter("Sony", 5000.36, 78, 7, 2015, 24);
        UAV avia3 = new AgriculturalDrone(20.3, 542.75, "Lilo", 5);
        UAV avia4 = new UAV(42.0, 432.85);
        Airplane avia5 = new Airplane("Yamaha", 19800.85, 72);
        UAV avia6 = new MAV(0.5, 226.99, "m-267", 20.2);
        Airplane avia7 = new Quadcopter("Mitsubishi", 7835.21, 924, 2, 2001, 12, 56);
        Airplane avia8 = new Multirotor("Mitsubishi", 7835.21, 924, 2, 2001, 12, 31);
        UAV avia9 = new UAV(25.76, 392.69);
        Airplane avia10 = new Quadcopter("Jetski", 745.01, 23, 4, 1976, 12, 231);
        UAV avia11 = new MAV(1.45, 281.01, "k-09", 50.0);
        Airplane avia12 = new Multirotor("Dooby", 6934.54, 16, 5, 2003, 50, 20);
        UAV avia13 = new AgriculturalDrone(42.0, 432.85, "Stitch", 15);
        Airplane avia14 = new Helicopter("Dirabel", 8724.78, 81, 2, 2000, 30);
        UAV avia15 = new UAV(25.76, 392.69);

        Airplane avia16 = new Airplane("Suzuki", 10000.75, 34);
        Airplane avia17 = new Helicopter("Sony", 5000.36, 78, 7, 2015, 24);
        Airplane avia18 = new Quadcopter("Jetski", 745.01, 23, 4, 1976, 12, 231);
        Airplane avia19 = new Multirotor("Dooby", 6934.54, 16, 5, 2003, 50, 20);
        Airplane avia20 = new Airplane("Yamaha", 19800.85, 72);
        Airplane avia21 = new Helicopter("Dirabel", 8724.78, 81, 2, 2000, 30);
        Airplane avia22 = new Quadcopter("Mitsubishi", 7835.21, 924, 2, 2001, 12, 56);
        Airplane avia23 = new Multirotor("Mitsubishi", 7835.21, 924, 2, 2001, 12, 31);

        System.out.println(avia1.toString());
        System.out.println(avia2.toString());
        System.out.println(avia3.toString());
        System.out.println(avia4.toString());
        System.out.println(avia5.toString());
        System.out.println(avia6.toString());
        System.out.println(avia7.toString());
        System.out.println(avia8.toString());
        System.out.println(avia9.toString());
        System.out.println(avia10.toString());
        System.out.println(avia11.toString());
        System.out.println(avia12.toString());
        System.out.println(avia13.toString());
        System.out.println(avia14.toString());
        System.out.println(avia15.toString());

        System.out.println();

        System.out.println(avia1.equals(avia2)); // diff classes a/a
        System.out.println(avia5.equals(avia9)); // diff classes a/uav
        System.out.println(avia1.equals(avia5)); // same class diff values
        System.out.println(avia13.equals(avia10)); // same class diff values
        System.out.println(avia12.equals(avia13)); // similar values
        System.out.println(avia9.equals(avia15)); // same values
        System.out.println(avia7.equals(avia8)); // same values diff class

        FlyingObject[] array1 = {avia1, avia2, avia3, avia4, avia5, avia6, avia7, avia8, avia9, avia10, avia11, avia12, avia13, avia14, avia15};
        FlyingObject[] array2 = {avia1, avia2, avia5, avia7, avia8, avia10, avia12, avia14, avia16, avia17, avia18, avia19, avia20, avia21, avia22, avia23};

        System.out.println();

        System.out.println(findLeastAndMostExpensiveUAV(array1));
        System.out.println();
        System.out.println(findLeastAndMostExpensiveUAV(array2));





    }
}
