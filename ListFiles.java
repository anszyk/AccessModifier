package AccessModifier; //работа с файлами 119 page

import java.io.*;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\Анастасия\\Downloads\\книги"); //Создается объект File для каталога. При создании объекта(File)файл в действительности не создается, происходит представление конкретного эл-та в файловой системе
        if (dir.exists()) { //вывести имена всех файлов в каталоге
            String[] files = dir.list();
            System.out.println(files.length + " найлов найдено...");
            for (int i = 0;i <files.length; i++) {
                System.out.println(files[i]);
            }
        } else System.out.println("Каталог не найден");
        //создаем файл. Данный файл будет расположен в том же каталоге, что и программа, но аргумент может содержать путь к файлу в любом месте(к примеру чтение файлов из папки "Загрузки")
        dir = new File("FileTxtThree.txt");
        dir.createNewFile();
    }
}