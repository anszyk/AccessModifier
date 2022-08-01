package AccessModifier.Interface; //Вывод сообщений page 165

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Messages extends JFrame implements ActionListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    //интерфейс ActionListener генерирует событие при нажатии на кнопку
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JButton btn1 = new JButton("Показать информационное сообщение");
    JButton btn2 = new JButton("Показать предупреждение");
    JButton btn3 = new JButton("Показать сообщение об ошибке");

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Messages() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(btn1); //добавление компонентов JButton на контейнер JPanel
        pnl.add(btn2);
        pnl.add(btn3);

        btn1.addActionListener(this); //метод addActionListener() из интерфейса ActionListener генерирует событие при нажатии на кнопку. В качестве аргумента передается слово this
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public void actionPerformed(ActionEvent event) { //метод actionPerformed(ActionEvent event) - обработчик событий
        if (event.getSource() == btn1) { //метод getSource() идентифицирует исходный компонент, являющийся инициатором событий
            JOptionPane.showMessageDialog(this, "Информация...", "Диалоговое сообщение", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Информация...", "Диалоговое сообщение", JOptionPane.INFORMATION_MESSAGE);
            //класс JOptionPane создает стандартное диалоговое окно. Метод howMessageDialog() отображает сообщение пользователю(information or warning or error)
        }
        if (event.getSource() == btn2) {
            JOptionPane.showMessageDialog(this, "Предупреждение...", "Диалоговое сообщение", JOptionPane.WARNING_MESSAGE);
        }
        if (event.getSource() == btn3) {
            JOptionPane.showMessageDialog(this, "Ошибка...", "Диалоговое сообщение", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Messages gui = new Messages(); //экземпляр класса Messages

    }
}
