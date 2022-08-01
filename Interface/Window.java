package AccessModifier.Interface; //Создание окна page 136

import javax.swing.*;

public class Window extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Window() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel
        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Window gui = new Window(); //экземпляр класса Window

    }
}
