// -----------------------------------------------------
// Part: II
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package main;

/**
 * FlyingObject represents a flying object
 */
public abstract class FlyingObject {
    protected double price;

    /**
     * Default constructor
     */
    public FlyingObject() {
        this.price = 0.0;
    }

    /**
     * Parameterized constructor
     */
    public FlyingObject(double price) {
        this.price = price;
    }

    /**
     * Accessor
     * @return price
     */
    public abstract double getPrice();

    /**
     * Mutator
     * @param price
     */
    public abstract void setPrice(double price);

    /**
     * Copy method for polymorphism
     * @param flyingObject
     * @return a copied flying object
     */
    protected abstract FlyingObject copyObject(FlyingObject flyingObject);
}