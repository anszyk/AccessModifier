package AccessModifier.Interface; //Добавление кнопок page 138

import javax.swing.*;

public class Buttons extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна
    //ClassLoader ldr = this.getClass().getClassLoader(); //объект ClassLoader загружает изображения (необходимо в случае распространения программы в виде одиночного Java-архива(JAR))

    /* почему-то NullPointerException скорее всего надо переместить файлы в src:
    URL tickURL = ldr.getResource("C:/Users/Анастасия/IdeaProjects/untitled/pngegg.png"); //методу getResource() указывается имя файла или путь,
    // в результате будет возвращаться адрес URL, который используется в качестве аргумента для конструктора ImageIcon
    URL crossURL = ldr.getResource("C:/Users/Анастасия/IdeaProjects/untitled/pngwing.com.png");
    ImageIcon tick = new ImageIcon(tickURL); //создали объект изображения
    ImageIcon cross = new ImageIcon(crossURL);*/

    ImageIcon tick = new ImageIcon("C:/Users/Анастасия/Downloads/pngegg.png"); //создали объект изображения
    ImageIcon cross = new ImageIcon("pngwing.com.png");
    JButton btn = new JButton("Нажми");
    JButton tickBtn = new JButton(tick); //Чтобы отобразить изображение на кнопке, нужно указать имя объекта ImageIcon
    // в качестве аргумента конструктору JButton можно указать два аргумента - строку и имя объекта ImageIcon
    JButton crossBtn = new JButton("СТОП", cross);

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Buttons() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 350); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(btn); //добавление компонентов JButton на контейнер JPanel
        pnl.add(tickBtn);
        pnl.add(crossBtn);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Buttons gui = new Buttons(); //экземпляр класса Buttons

    }


}
