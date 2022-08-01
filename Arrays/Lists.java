package AccessModifier.Arrays; //Создание списочных массивов page 128

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //создание строкового списочного массива

        list.add("Альфа"); //операторы, заполняющие элементы списка строковыми значениями
        list.add("Дельта");
        list.add("Чарли");
        System.out.println("Список: " + list);

        System.out.println("Заменяем: " + list.get(1) + "\n"); //идентифицируем текущее значение во втором элементе
        list.set(1, "Браво"); //заменить второй элемент новым значением

        /*Для обхода списка элементов используется метод forEach(), которому передаем "лямбда выражение" в качестве аргумента: (аргумент(ы)) -> {оператор(ы)} */
        list.forEach((x) -> System.out.println("Элемент: " + x)); //сделаем обход списка и выведем строковое значение из каждого элемента
    }
}
