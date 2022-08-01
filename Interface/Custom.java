package AccessModifier.Interface; //Изменение внешнего вида интерфейса page 148

import javax.swing.*;
import java.awt.*;

public class Custom extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    /*В интерфейс можно добавлять объект "метки" при помощи класса JLabel. Элемент используется для отображения
     * неизменяемого изображения и/или текста*/
    JLabel lbl1 = new JLabel("Пользовательский задний фон");  //объект для вывода текста
    JLabel lbl2 = new JLabel("Пользовательский передний фон");
    JLabel lbl3 = new JLabel("Пользовательский шрифт");

    Color customColor = new Color(57, 154, 111); //Класс Color предоставляет набор базовых цветов. Конструктор принимает на вход три целочисленных аргумента

    Font customFont = new Font("Serif", Font.PLAIN, 32); //Класс Font изменяет шрифт отображаемого текста. Конструктор принимает на вход три аргумента(имя, стиль, размер)

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Custom() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        /*изменение цвета заднего фона*/
        lbl1.setOpaque(true); //задний фон всегда прозрачный. Метод setOpaque() изменяет значение непрозрачности
        lbl1.setBackground(customColor); //раскрашиваем задний фон
        lbl2.setForeground(Color.PINK); //изменение цвета переднего плана

        lbl3.setFont(customFont); //изменение текста на компоненте JLabel с использованием пользовательского шрифта

        pnl.add(lbl1); //добавляем компонент JLabel в контейнер JPanel
        pnl.add(lbl2);
        pnl.add(lbl3);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Custom gui = new Custom(); //экземпляр класса Custom

    }
}
