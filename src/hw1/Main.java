package hw1;

import hw1.fruit.Apple;
import hw1.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"A", "B", "C", "D", "E"};

        System.out.println(Arrays.toString(replaceElement(array1, 0, array1.length - 1)));
        System.out.println(Arrays.toString(replaceElement(array2, 1, array1.length - 2)));

        System.out.println(arrayToList(array1));

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        for (int i = 0; i < 10; i++) {
            appleBox1.box.add(new Apple());
        }

        for (int i = 0; i < 8; i++) {
            orangeBox.box.add(new Orange());
        }

        System.out.printf("Количество яблок в 1-й коробке: %d\n", appleBox1.box.size());
        System.out.printf("Количество яблок во 2-й коробке: %d\n", appleBox2.box.size());
        System.out.printf("Количество апельсин в 3-й коробке: %d\n", orangeBox.box.size());

        System.out.printf("Вес 1-й коробки: %.2f\n", appleBox1.getWeight());
        System.out.printf("Вес 2-й коробки: %.2f\n", appleBox2.getWeight());
        System.out.printf("Вес 3-й коробки: %.2f\n", orangeBox.getWeight());

        System.out.println(appleBox1.compare(orangeBox));

        appleBox1.moveFruit(appleBox2);
        System.out.printf("Количество яблок в 1-й коробке: %d\n", appleBox1.box.size());
        System.out.printf("Количество яблок во 2-й коробке: %d\n", appleBox2.box.size());
    }

    public static <T> T[] replaceElement(T[] arr, int firstElement, int secondElement) {
        T auxiliaryVariable = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = auxiliaryVariable;
        return arr;
    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}