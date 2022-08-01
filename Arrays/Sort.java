package AccessModifier.Arrays; //Сортировка элементов массива page 126

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] names = {"Майк", "Дейв", "Энди"};
        int[] nums = {200, 300, 100};

        display(names); //Этот метод отображает массив names в поток стандартного вывода
        display(nums); //Этот метод отображает массив nums в поток стандартного вывода
        Arrays.sort(names); //Сортировка массива names
        Arrays.sort(nums); //Сортировка массива nums
        display(names);
        display(nums);
    }

    public static void display(String[] elems) { //метод для отображения содержимого всех элементов переданного строкового массива
        System.out.println("\nСтроковый массив:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }

    }

    public static void display(int[] elems) { //метод для отображения содержимого всех элементов переданного целочисленного массива
        System.out.println("\nЦелочисленный массив:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }

    }
}
