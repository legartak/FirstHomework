package com.legartak.ThirdTask;

public class Sphere extends Figure{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0d/3.0d) * Math.PI * Math.pow(radius, 3);
    }
}
