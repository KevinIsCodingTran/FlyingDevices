// -----------------------------------------------------
// Part: II
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack4;


import main.FlyingObject;

/**
 * UAV class
 */
public class UAV extends FlyingObject {
    protected double weight;

    /**
     * Default constructor
     */
    public UAV() {
        super();
        this.weight = 0.0;
    }

    /**
     * Parameterized constructor
     * @param weight
     * @param price
     */
    public UAV(double weight, double price) {
        super(price);
        this.weight = weight;
    }

    /**
     * Copy method for polymorphism
     * @param flyingObject
     * @return a copied UAV object
     */
    @Override
    protected UAV copyObject(FlyingObject flyingObject) {
        return new UAV((UAV) flyingObject);
    }

    /**
     * Copy constructor
     * @param other
     */
    public UAV(UAV other) {
        this.weight = other.weight;
        this.price = other.price;
    }

    /**
     * Accessor weight
     * @return weight
     */
    public double getWeight() {
        return this.weight;
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
     * Mutator weight
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
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
        return "This " + this.getClass().getSimpleName() + " weighs " + this.weight + " pounds, and costs " + this.price + "$.";
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

        UAV otherRef = (UAV) objRef;

        return this.weight == otherRef.weight && this.price == otherRef.price;
    }
}
