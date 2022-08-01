package AccessModifier; //Чтение файлов 122 page

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        try { //метод readline() следует вызывать внутри блока try catch для перехвата исключений ввода-вывода
            String line = ""; //в этой переменной будут сохраняться строки текста

            FileReader fr = new FileReader("oscar.txt"); //создали объект FileReader для чтения текстовых файлов, преобразует байты в целые числа
            BufferedReader br = new BufferedReader(fr); //объект BufferedReader для чтения декодированного ввода

            while ((line = br.readLine()) != null) { //цикл для чтения всех строк из фа ла присваиваем переменной содержимое текстового файла
                System.out.println(line); //выводим все строки ("System.out.println(line);" без цикла выводит только одну строку)
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка чтения");
        }
    }
}
