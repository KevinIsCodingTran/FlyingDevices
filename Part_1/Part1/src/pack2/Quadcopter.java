// -----------------------------------------------------
// Part: I
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack2;

import main.FlyingObject;
import pack1.Airplane;

/**
 * Quadcopter class
 */
public class Quadcopter extends Helicopter {
    private int maxFlySpeed;

    /**
     * Default constructor
     */
    public Quadcopter() {
        super();
        this.maxFlySpeed = 0;
    }

    /**
     * Parameterized constructor
     * @param brand
     * @param price
     * @param hp
     * @param cyl
     * @param year
     * @param capacity
     * @param speed
     */
    public Quadcopter(String brand, double price, int hp, int cyl, int year, int capacity, int speed) {
        super(brand, price, hp, cyl, year, capacity);
        this.maxFlySpeed = speed;
    }

    /**
     * Copy constructor
     * @param other
     */
    public Quadcopter(Quadcopter other) {
        this.brand = other.brand;
        this.price = other.price;
        this.horsepower = other.horsepower;
        this.numbCylinders = other.numbCylinders;
        this.yearCreation = other.yearCreation;
        this.passCapacity = other.passCapacity;
        this.maxFlySpeed = other.maxFlySpeed;
    }

    /**
     * Accessor max fly speed
     * @return maxFlySpeed
     */
    public int getMaxFlySpeed() {
        return this.maxFlySpeed;
    }

    /**
     * Mutator maxFlySpeed
     * @param maxFlySpeed
     */
    public void setMaxFlySpeed(int maxFlySpeed) {
        this.maxFlySpeed = maxFlySpeed;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "it's maximum moving speed is " + this.maxFlySpeed + " km/h.";
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

        Quadcopter otherRef = (Quadcopter) objRef;

        return super.equals(otherRef) && this.maxFlySpeed == otherRef.maxFlySpeed;
    }
}
