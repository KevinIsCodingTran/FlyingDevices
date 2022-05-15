// -----------------------------------------------------
// Part: II
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
 * Driver class to copy an array of flying objects
 */
public class Driver {

    /**
     * Copy and return an array of flying objects
     * @param array
     * @return copied array
     */
    public static FlyingObject[] copyFlyingObjects(FlyingObject[] array) {
        FlyingObject[] arrCopy = new FlyingObject[array.length];

        for (int i = 0; i < array.length; i++) {
            arrCopy[i] = array[i].copyObject(array[i]);
        }

        return arrCopy;
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        Airplane avia1 = new Airplane("Suzuki", 10000.75, 34);
        Airplane avia2 = new Helicopter("Sony", 5000.36, 78, 7, 2015, 24);
        Airplane avia3 = new Quadcopter("Jetski", 745.01, 23, 4, 1976, 12, 231);
        Airplane avia4 = new Multirotor("Dooby", 6934.54, 16, 5, 2003, 50, 20);
        Airplane avia5 = new Airplane("Yamaha", 19800.85, 72);
        Airplane avia6 = new Helicopter("Dirabel", 8724.78, 81, 2, 2000, 30);
        Airplane avia7 = new Quadcopter("Mitsubishi", 7835.21, 924, 2, 2001, 12, 56);
        Airplane avia8 = new Multirotor("Mitsubishi", 7835.21, 924, 2, 2001, 12, 31);
        UAV avia9 = new UAV(25.76, 392.69);
        UAV avia10 = new AgriculturalDrone(20.3, 542.75, "Lilo", 5);
        UAV avia11 = new MAV(1.45, 281.01, "k-09", 50.0);
        UAV avia12 = new UAV(42.0, 432.85);
        UAV avia13 = new AgriculturalDrone(42.0, 432.85, "Stitch", 15);
        UAV avia14 = new MAV(0.5, 226.99, "m-267", 20.2);
        UAV avia15 = new UAV(25.76, 392.69);

        FlyingObject[] array = {avia1, avia2, avia3, avia4, avia5, avia6, avia7, avia8, avia9, avia10, avia11, avia12, avia13, avia14, avia15};

        FlyingObject[] arrCopy = copyFlyingObjects(array);

        for (int j = 0; j < arrCopy.length; j++) {
            System.out.println(array[j].toString());
        }

        System.out.println();

        for (int i = 0; i < arrCopy.length; i++) {
            System.out.println(arrCopy[i].toString());
        }
    }
}
