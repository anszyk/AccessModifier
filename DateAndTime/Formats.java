package AccessModifier.DateAndTime; //Форматирование чисел page 132

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formats {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance(); //при создании объекта NumberFormat определяется его тип форматирования: getNumberInstance() для разделения числа
        System.out.println("\nЧисло: " + nf.format(123456789));

        NumberFormat cf = NumberFormat.getCurrencyInstance(); //getCurrencyInstance() для символов валюты
        System.out.println("\nВалюта: " + cf.format(1234.50f));

        NumberFormat pf = NumberFormat.getPercentInstance(); //getPercentInstance() для знаков процента
        System.out.println("\nПроцент: " + pf.format(0.75f));

        LocalDateTime now = LocalDateTime.now(); //создали объект текущего времени

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy"); //задали формат даты
        System.out.println("\nДата: " + now.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
        System.out.println("\nВремя: " + now.format(tf));

    }
}
