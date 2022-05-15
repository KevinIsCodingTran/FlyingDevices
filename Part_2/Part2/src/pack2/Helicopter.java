// -----------------------------------------------------
// Part: II
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack2;

import main.FlyingObject;
import pack1.Airplane;

/**
 * Helicopter class
 */
public class Helicopter extends Airplane {
    protected int numbCylinders;
    protected int yearCreation;
    protected int passCapacity;

    /**
     * Default constructor
     */
    public Helicopter() {
        super();
        this.numbCylinders = 0;
        this.yearCreation = 0;
        this.passCapacity = 0;
    }

    /**
     * Parameterized constructor
     * @param brand
     * @param price
     * @param hp
     * @param cyl
     * @param year
     * @param capacity
     */
    public Helicopter(String brand, double price, int hp, int cyl, int year, int capacity) {
        super(brand, price, hp);
        this.numbCylinders = cyl;
        this.yearCreation = year;
        this.passCapacity = capacity;
    }

    /**
     * Copy method for polymorphism
     * @param flyingObject
     * @return a copied Helicopter object
     */
    @Override
    protected Helicopter copyObject(FlyingObject flyingObject) {
        return new Helicopter((Helicopter) flyingObject);
    }

    /**
     * Copy constructor
     * @param other
     */
    public Helicopter(Helicopter other)
    {
        this.brand = other.brand;
        this.price = other.price;
        this.horsepower = other.horsepower;
        this.numbCylinders = other.numbCylinders;
        this.yearCreation = other.yearCreation;
        this.passCapacity = other.passCapacity;
    }

    /**
     * Accessor numbCylinders
     * @return numbCylinders
     */
    public int getNumbCylinders() {
        return this.numbCylinders;
    }
    /**
     * Accessor yearCreation
     * @return yearCreation
     */
    public int getYearCreation() {
        return this.yearCreation;
    }
    /**
     * Accessor passCapacity
     * @return passCapacity
     */
    public int getPassCapacity() {
        return this.passCapacity;
    }

    /**
     * Mutator numbCylinders
     * @param numbCylinders
     */
    public void setNumbCylinders(int numbCylinders) {
        this.numbCylinders = numbCylinders;
    }
    /**
     * Mutator yearCreation
     * @param yearCreation
     */
    public void setYearCreation(int yearCreation) {
        this.yearCreation = yearCreation;
    }
    /**
     * Mutator passCapacity
     * @param passCapacity
     */
    public void setPassCapacity(int passCapacity) {
        this.passCapacity = passCapacity;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "There are " + this.numbCylinders + " cylinders and was created in " + this.yearCreation
                + ". It can carry up to " + this.passCapacity + " passengers and ";
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

        Helicopter otherRef = (Helicopter) objRef;

        return super.equals(otherRef) && this.numbCylinders == otherRef.numbCylinders && this.yearCreation == otherRef.yearCreation &&
                this.passCapacity == otherRef.passCapacity;
    }
}
