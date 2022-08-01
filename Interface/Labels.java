package AccessModifier.Interface; //Добавление меток page 140

import javax.swing.*;

public class Labels extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    ClassLoader ldr = this.getClass().getClassLoader();
    ImageIcon duke = new ImageIcon("C:/Users/Анастасия/Downloads/horse.png");

    /*В интерфейс можно добавлять объект "метки" при помощи класса JLabel. Элемент используется для отображения
    * неизменяемого изображения и/или текста*/
    JLabel lbl1 = new JLabel(duke); //объект для вывода изображения
    JLabel lbl2 = new JLabel("Лошадь - просто лошадь"); //объект для вывода текста
    JLabel lbl3 = new JLabel("И это лошадь", duke, JLabel.CENTER); //объект для вывода изображения и текста, размещенный по центру

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Labels() {
        super("Обзор на..."); //заголовок окна
        setSize(500, 350); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        lbl3.setHorizontalTextPosition(JLabel.CENTER); //определяем относительное положение текста для третьей метки
        lbl3.setVerticalTextPosition(JLabel.BOTTOM);

        lbl1.setToolTipText("Лошадь"); //создание тултипа(подсказки) для первой метки

        pnl.add(lbl1); //добавили компонент JLabel
        pnl.add(lbl2);
        pnl.add(lbl3);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Labels gui = new Labels(); //экземпляр класса Labels

    }


}
