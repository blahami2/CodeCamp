package cz.blahami2.codecamp.model;

/**
 * Created by blaha on 03.11.2016.
 */

public class Currency {
    private String name;
    private double eurRatio;

    public Currency( String name, double eurRatio ) {
        this.name = name;
        this.eurRatio = eurRatio;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public double getEurRatio() {
        return eurRatio;
    }

    public void setEurRatio( double eurRatio ) {
        this.eurRatio = eurRatio;
    }

    public double toEur( double value ) {
        return value * eurRatio;
    }

    public double fromEur( double value ) {
        return value / eurRatio;
    }
}
