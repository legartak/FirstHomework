package com.legartak.ThirdTask;

import java.util.List;
import java.util.Objects;

public abstract class Figure implements Comparable<Figure>{

    public abstract double getVolume();

    public static List<Figure> collectionSorting(List<Figure> figureCollection) {
        Objects.requireNonNull(figureCollection);

        return figureCollection.stream().sorted().toList();
    }

    @Override
    public int compareTo(Figure o) {
        return (int)(this.getVolume() - o.getVolume());
    }

    @Override
    public String toString() {
       return  "" + this.getClass().getSimpleName() +
                ": " +
                "%.2f".formatted(getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        return this.getVolume() == ((Figure) obj).getVolume();
    }
}
