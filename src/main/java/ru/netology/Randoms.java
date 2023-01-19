package ru.netology;

import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(min);
    }

    class Iterator implements java.util.Iterator<Integer> {
        int current;

        public Iterator(int current) {
            this.current = current;
        }

        public boolean hasNext() {
            return current <= max;
        }

        public Integer next() {
            Random r = new Random();
            return current = r.nextInt((max - min) + 1) + min;
        }
    }
}
