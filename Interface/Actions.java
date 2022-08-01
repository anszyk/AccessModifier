package AccessModifier.Interface; //Обработка событий кнопок page 156

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions extends JFrame implements ActionListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    //интерфейс ActionListener генерирует событие при нажатии на кнопку
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JButton btn1 = new JButton("Кнопка 1");
    JButton btn2 = new JButton("Кнопка 2");
    JTextArea txtArea = new JTextArea(5, 38); // объект принимает на вход числовое значение, определяющее размер текстового поля

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Actions() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(btn1); //добавили компонент JButton
        pnl.add(btn2);
        pnl.add(txtArea); //добавили контейнер JTextField

        btn2.setEnabled(false); //метод setEnabled() отключает компонент JButton
        txtArea.setText("Кнопка 2 деактивирована"); //метод setText() помещает строковое значение из аргумента в многострочное текстовое поле

        btn1.addActionListener(this); //метод addActionListener() из интерфейса ActionListener генерирует событие при нажатии на кнопку. В качестве аргумента передается слово this
        btn2.addActionListener(this);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public void actionPerformed(ActionEvent event) { //метод actionPerformed(ActionEvent event) - обработчик событий

        if(event.getSource() == btn1) { //метод getSource() идентифицирует исходный компонент, являющийся инициатором событий
            btn2.setEnabled(true); //метод setEnabled() включает компонент JButton с аргументом true
            btn1.setEnabled(false); //метод setEnabled() отключает компонент JButton с аргументом false
        }

        if(event.getSource() == btn2) { //нажал кнопку 2 - деактивировалась кнопка 2 - активировалась кнопка 1
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }

        txtArea.setText(event.getActionCommand() //метод getActionCommand() возвращает строковое значение
                + " Нажата и деактивирована");
    }

    public static void main(String[] args) {
        Actions gui = new Actions(); //экземпляр класса Actions
    }
}
