package hw1;

import hw1.fruit.Weight;

import java.util.ArrayList;

public class Box<T extends Weight> implements Comparable<Box> {
    public ArrayList<T> box;
    private float weight;

    public Box() {
        this.box = new ArrayList<>();
        this.weight = 5.0f;
    }

    public boolean compare(Box b) {
        return compareTo(b) == 0;
    }

    @Override
    public int compareTo(Box b) {
        return (int) (this.getWeight() - b.getWeight());
    }

    public float getWeight() {
        if (box.isEmpty()) {
            return weight;
        }
        return weight + (box.size() * box.get(0).getWeight());
    }

    public void moveFruit(Box b) {
        b.box.addAll(this.box);
        this.box.clear();
    }
}