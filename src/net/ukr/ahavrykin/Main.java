package net.ukr.ahavrykin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        numberList();
    }

    public static void numberList() {
        List<Integer> elements = new ArrayList<>(4);
        for (int i = 0; i < 10; i++) {
            int element = (int) (Math.random() * 100);
            elements.add(element);
        }

        elements.remove(0);
        elements.remove(0);
        elements.remove(elements.size() - 1);
        System.out.println(elements);
    }
}
