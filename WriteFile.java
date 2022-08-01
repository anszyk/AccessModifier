package AccessModifier; //Запись файлов 124 page

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("tam.txt");  //создается объект FileWriter для текстового файла с именем tam.txt
            BufferedWriter bw = new BufferedWriter(fr); //создается объект BufferedWriter для записи файла

            bw.write("Дул ветер из последних сил, "); //Метод записывает текст (если файл с указанным именем уже существует, то метод станет перезаписывать содержимое файла. Иначе создастся новый файл)
            bw.newLine(); //метод разделяет текст на новую строку
            bw.write("И град хлестал, и ливень лил,");
            bw.newLine();
            bw.write("И вспышки молний тьма глотала,");
            bw.newLine();
            bw.write("И небо долго грохотало...");
            bw.newLine();
            bw.write("В такую ночь, как эта ночь,");
            bw.newLine();
            bw.write("Сам дьявол погулять не прочь.");
            bw.newLine();
            bw.append("Плыли мы по морю ветер мачту рвал"); //чтобы не перезаписывать текст в файле при помощи метода write() можно использовать метод append() для добавления текста в файл

            bw.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка записи");
        }
    }
}
