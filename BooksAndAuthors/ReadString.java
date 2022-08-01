package AccessModifier.BooksAndAuthors;

import java.io.*;

public class ReadString {
    public static void main(String[] args){
        String input = ""; //в этой переменной будут сохранятся введеные значения

        System.out.println("Введите название книги: ");
        InputStreamReader isr = new InputStreamReader(System.in); //объект InputStreamReader, позволяющий читать данные, вводимые с командной строки, преобразуя поток байтов в целые числа
        BufferedReader br = new BufferedReader(isr); //объект BufferedReader для чтения декодированного ввода

        Authors authors = new Authors();
        authors.addBooksAndAuthors("Маленький принц", "Антуан де Сент-Экзюпери");
        authors.addBooksAndAuthors("Алхимик", "Пауло Коэльо");
        authors.addBooksAndAuthors("Старик и море", "Эрнест Хемингуэй");
        authors.addBooksAndAuthors("Скотный двор", "Джордж Оруэлл");

        try { //в блоке try catch будет происходить чтение данных из командной строки и их сохранение в переменную(String input)
            input = br.readLine();
            br.close();
            if((authors.list.containsKey(input))) {
                System.out.print("\nВы читаете книгу \"" + input + "\"" + authors.get(input));
            } else System.out.println(authors.d);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода...");
        }
    }
}
