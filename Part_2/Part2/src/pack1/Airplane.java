// -----------------------------------------------------
// Part: II
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack1;

import main.FlyingObject;

/**
 * Airplane class
 */
public class Airplane extends FlyingObject {
    protected String brand;
    protected int horsepower;

    /**
     * Default constructor
     */
    public Airplane() {
        super();
        this.brand = "";
        this.horsepower = 0;
    }

    /**
     * Parameterized constructor
     * @param brand
     * @param price
     * @param hp
     */
    public Airplane(String brand, double price, int hp) {
        super(price);
        this.brand = brand;
        this.horsepower = hp;
    }

    /**
     * Copy method for polymorphism
     * @param flyingObject
     * @return a copied AgriculturalDrone object
     */
    @Override
    protected Airplane copyObject(FlyingObject flyingObject) {
        return new Airplane((Airplane) flyingObject);
    }

    /**
     * Copy constructor
     * @param other
     */
    public Airplane(Airplane other) {
        this.brand = other.brand;
        this.horsepower = other.horsepower;
        this.price = other.price;
    }

    /**
     * Accessor brand
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }
    /**
     * Accessor horsepower
     * @return horsepower
     */
    public int getHorsepower() {
        return this.horsepower;
    }

    /**
     * Accessor price
     * @return price
     */
    @Override
    public double getPrice() {
        return this.price;
    }

    /**
     * Mutator brand
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * Mutator hp
     * @param hp
     */
    public void setHorsepower(int hp) {
        this.horsepower = hp;
    }
    /**
     * Mutator price
     * @param price
     */
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString() {
        return  "This " + this.getClass().getSimpleName() + " is manufactured by " + this.brand + ". It costs " + this.price + "$ and has a horsepower of " + this.horsepower + " hp. ";
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

        Airplane otherRef = (Airplane) objRef;

        return this.brand == otherRef.brand && this.price == otherRef.price && this.horsepower == otherRef.horsepower;
    }
}




