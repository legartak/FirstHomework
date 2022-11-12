package com.legartak.ThirdTask;

public class Cone extends Figure{

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0d/3.0d) * Math.PI * Math.pow(radius, 2) * height;
    }
}
