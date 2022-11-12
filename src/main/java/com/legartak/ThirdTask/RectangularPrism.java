package com.legartak.ThirdTask;

public class RectangularPrism extends Figure{

    private double length;
    private double height;
    private double width;

    public RectangularPrism(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}
