// -----------------------------------------------------
// Part: II
// Written by: Kevin Tran (40209451)
// -----------------------------------------------------
package pack5;


import main.FlyingObject;
import pack4.UAV;

/**
 * MAV class
 */
public class MAV extends UAV {
    private String model;
    private double size;

    /**
     * Default constructor
     */
    public MAV() {
        super();
        this.model = "";
        this.size = 0.0;
    }

    /**
     * Parameterized constructor
     * @param weight
     * @param price
     * @param model
     * @param size
     */
    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    /**
     * Copy constructor
     * @param other
     */
    public MAV(MAV other) {
        this.weight = other.weight;
        this.price = other.price;
        this.model = other.model;
        this.size = other.size;
    }

    /**
     * Copy method for polymorphism
     * @param flyingObject
     * @return a copied MAV object
     */
    @Override
    protected MAV copyObject(FlyingObject flyingObject) {
        return new MAV((MAV) flyingObject);
    }

    /**
     * Accessor
     * @return model
     */
    public String getModel() {
        return this.model;
    }
    /**
     * Accessor
     * @return size
     */
    public double getSize() {
        return this.size;
    }

    /**
     * Mutator
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Mutator
     * @param size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString() {
        return  super.toString() + " It is the " + this.model + " model and it's10 size is "
                + this.size + " cm.";
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

        MAV otherRef = (MAV) objRef;

        return super.equals(otherRef) && this.model == otherRef.model && this.size == otherRef.size;
    }
}
