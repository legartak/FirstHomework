package com.legartak.ThirdTask;

public class Cube extends Figure{

    private double side;

    //передаємо в цей конструктор довжину однієї грані куба
    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3.0d);
    }
}
