package com.legartak.ThirdTask;

public class TriangularPyramid extends Figure{

    private double facet;
    private double height;

    public TriangularPyramid(double facet, double height) {
        this.facet = facet;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0d/3.0d) * facet * height;
    }
}
