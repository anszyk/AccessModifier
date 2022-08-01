package AccessModifier.Interface; //Размещение компонентов page 150

import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    Container contentPane = getContentPane(); //создан объект Container(представляющий контейнер JFrame)

    JPanel grid = new JPanel(new GridLayout(2, 2)); // создан объект JPanel с методом компоновки GridLayout(размещается поочередно в указанной области)

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Layout() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(new JButton("Да")); //добавление компонентов JButton на контейнер JPanel
        pnl.add(new JButton("Нет"));
        pnl.add(new JButton("Отмена"));
        grid.add(new JButton("1")); //добавление компонентов JButton на контейнер JPanel
        grid.add(new JButton("2"));
        grid.add(new JButton("3"));
        grid.add(new JButton("4"));

        contentPane.add("North", pnl); //добавление панели в контейнер contentPane
        contentPane.add("Center", grid);
        contentPane.add("West", new JButton("Запад"));

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Layout gui = new Layout(); //экземпляр класса Layout

    }

}
