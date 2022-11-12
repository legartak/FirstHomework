package com.legartak.ThirdTask;

public class TriangularPrism extends Figure{

    //грань основи трикутної призми
    private double facet;
    private double height;

    public TriangularPrism(double facet, double height) {
        this.facet = facet;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return facet * height;
    }
}
