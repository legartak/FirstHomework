package com.legartak.ThirdTask;

import java.util.List;

public abstract class Figure implements Comparable<Figure>{

    public abstract double getVolume();

    public static List<Figure> collectionSorting(List<Figure> figureCollection) {
        if (figureCollection == null) {
            return null;
        }

        return figureCollection.stream().sorted().toList();
    }

    @Override
    public int compareTo(Figure o) {
        return (int)(this.getVolume() - o.getVolume());
    }

    @Override
    public String toString() {
        String stringBuilder = "" + this.getClass().getSimpleName() +
                ": " +
                "%.2f".formatted(getVolume());
        return stringBuilder;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        return this.getVolume() == ((Figure) obj).getVolume();
    }
}
