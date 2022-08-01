package AccessModifier.Interface; //Добавление переключателей page 146

import javax.swing.*;

public class Radios extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JRadioButton rad1 = new JRadioButton("Красное", true); // Класс создает JRadioButton компонент "переключатель".
    // Конструктор принимает на вход текст и/или логический аргумент true(выбор по умолчанию)
    JRadioButton rad2 = new JRadioButton("Розовое");
    JRadioButton rad3 = new JRadioButton("Белое");

    ButtonGroup wines = new ButtonGroup(); //объединяем переключатели(из группы может быть выбран только один)

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Radios() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        wines.add(rad1); //добавляем компонент JRadioButton в группу ButtonGroup
        wines.add(rad2);
        wines.add(rad3);

        pnl.add(rad1); //добавляем компонент JRadioButton в контейнер JPanel
        pnl.add(rad2);
        pnl.add(rad3);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Radios gui = new Radios(); //экземпляр класса Radios

    }

}
