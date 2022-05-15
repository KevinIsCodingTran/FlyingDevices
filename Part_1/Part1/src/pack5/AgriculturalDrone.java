// -----------------------------------------------------
// Part: I
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack5;

import main.FlyingObject;
import pack4.UAV;

/**
 * AgriculturalDrone class
 */
public class AgriculturalDrone extends UAV {
    private String brand;
    private int carryCapacity;

    /**
     * Default constructor
     */
    public AgriculturalDrone() {
        super();
        this.brand = "";
        this.carryCapacity = 0;
    }

    /**
     * Parameterized constructor
     * @param weight
     * @param price
     * @param brand
     * @param capacity
     */
    public AgriculturalDrone(double weight, double price, String brand, int capacity) {
        super(weight, price);
        this.brand = brand;
        this.carryCapacity = capacity;
    }

    /**
     * Copy constructor
     * @param other
     */
    public AgriculturalDrone(AgriculturalDrone other) {
        this.weight = other.weight;
        this.price = other.price;
        this.brand = other.brand;
        this.carryCapacity = other.carryCapacity;
    }

    /**
     * Accessor brand
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }
    /**
     * Accessor carry capacity
     * @return carry capacity
     */
    public int getCarryCapacity() {
        return this.carryCapacity;
    }

    /**
     * Mutator brand
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * Mutator carry capacity
     * @param carryCapacity
     */
    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + " It is manufactured by " + this.brand + " and can carry up to "
                + this.carryCapacity + " Kg.";
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

        AgriculturalDrone otherRef = (AgriculturalDrone) objRef;

        return super.equals(otherRef) && this.brand == otherRef.brand && this.carryCapacity == otherRef.carryCapacity;
    }
}
