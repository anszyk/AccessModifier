package AccessModifier.Interface; //Добавление элементов выбора page 144

import javax.swing.*;

public class Items extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    String[] toppings = {"Пеперони", "Грибная", "С ветчиной", "Томатная"};

    JCheckBox chk1 = new JCheckBox(toppings[0]); // Класс JCheckBox добавляет "флажок". Конструктор принимает аргументом строковый аргумент и/или логическое значение true - выбор по умолчанию
    JCheckBox chk2 = new JCheckBox(toppings[1], true);
    JCheckBox chk3 = new JCheckBox(toppings[2]);
    JCheckBox chk4 = new JCheckBox(toppings[3]);

    String[] styles = {"В глубокой форме", "Для гурманов", "Тонкая"};

    JComboBox<String> box1 = new JComboBox<>(styles); // Класс JComboBox создает выпадающий список элементов(выбрать можно один элемент). Конструктор принимает на вход имя строкового массива

    JList<String> lst1 = new JList<>(toppings); // Класс JComboBox создает выпадающий список элементов. Конструктор принимает на вход имя строкового массива(выбрать можно 1 и более элементов)

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Items() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(chk1); //добавили компоненты JCheckBox в контейнер JPanel
        pnl.add(chk2);
        pnl.add(chk3);
        pnl.add(chk4);

        box1.setSelectedIndex(0); // установили выбор элемента по умолчанию
        pnl.add(box1); //добавили компонент JComboBox в контейнер JPanel

        pnl.add(lst1); // добавили компонент JList в контейнер JPanel

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Items gui = new Items(); //экземпляр класса Items

    }
}
