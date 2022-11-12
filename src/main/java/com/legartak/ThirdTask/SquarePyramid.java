package com.legartak.ThirdTask;

public class SquarePyramid extends Figure{

    private double side;
    private double height;

    public SquarePyramid(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0d/3.0d) * Math.pow(side, 2) * height;
    }
}
