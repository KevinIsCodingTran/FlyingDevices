// -----------------------------------------------------
// Part: I
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack3;

import main.FlyingObject;
import pack2.Helicopter;
import pack2.Quadcopter;

/**
 * Multirotor class
 */
public class Multirotor extends Helicopter {
    private int numbRotors;

    /**
     * Default constructor
     */
    public Multirotor() {
        super();
        this.numbRotors = 0;
    }

    /**
     * Parameterized constructor
     * @param brand
     * @param price
     * @param hp
     * @param cyl
     * @param year
     * @param capacity
     * @param rotor
     */
    public Multirotor(String brand, double price, int hp, int cyl, int year, int capacity, int rotor) {
        super(brand, price, hp, cyl, year, capacity);
        this.numbRotors = rotor;
    }

    /**
     * Copy constructor
     * @param other
     */
    public Multirotor(Multirotor other) {
        this.brand = other.brand;
        this.price = other.price;
        this.horsepower = other.horsepower;
        this.numbCylinders = other.numbCylinders;
        this.yearCreation = other.yearCreation;
        this.passCapacity = other.passCapacity;
        this.numbRotors = other.numbRotors;
    }

    /**
     * Accessor number of rotors
     * @return numbRotors
     */
    public int getNumbRotors() {
        return this.numbRotors;
    }

    /**
     * Mutator number of rotors
     * @param numbRotors
     */
    public void setNumbRotors(int numbRotors) {
        this.numbRotors = numbRotors;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "it has " + this.numbRotors + " rotors.";
    }

    /**
     * equals method
     * @param objRef
     * @return boolean
     */
    @Override
    public boolean equals(Object objRef) {
        if (this == objRef)
            return  true;
        if (objRef == null)
            return false;
        if (this.getClass() != objRef.getClass())
            return false;

        Multirotor otherRef = (Multirotor) objRef;

        return super.equals(otherRef) && this.numbRotors == otherRef.numbRotors;
    }
}
