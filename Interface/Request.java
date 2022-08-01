package AccessModifier.Interface; //Запрос пользовательского ввода page 166

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Request extends JFrame implements ActionListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    //интерфейс ActionListener генерирует событие при нажатии на кнопку
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JTextField field = new JTextField(38); // объект принимает на вход числовое значение, определяющее размер текстового поля
    JButton btn1 = new JButton("Запрос подтверждения");
    JButton btn2 = new JButton("Запрос ввода");

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Request() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(field); //добавили контейнер JTextField
        pnl.add(btn1); //добавление компонентов JButton на контейнер JPanel
        pnl.add(btn2);

        btn1.addActionListener(this); //метод addActionListener() из интерфейса ActionListener генерирует событие при нажатии на кнопку. В качестве аргумента передается слово this
        btn2.addActionListener(this);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public void actionPerformed(ActionEvent event) { //метод actionPerformed(ActionEvent event) - обработчик событий
        if(event.getSource() == btn1) { //метод getSource() идентифицирует исходный компонент, являющийся инициатором событий
            int n = JOptionPane.showConfirmDialog(this, "Вы согласны?", "Диалог подтверждения", JOptionPane.YES_NO_CANCEL_OPTION);
            //метод showConfirmDialog() запрашивает подтверждение. Константа YES_NO_CANCEL_OPTION определяет подтверждение
            switch (n) {
                case 0: field.setText("Согласен");
                break;
                case 1: field.setText("Не согласен");
                break;
                case 2: field.setText("Отменено");
            }
        }
        if (event.getSource() == btn2) {
            field.setText(JOptionPane.showInputDialog(this, "", "", JOptionPane.PLAIN_MESSAGE));
            // метод showInputDialog() предлагает ввести пользователю строку
        }
    }

    public static void main(String[] args) {
        Request gui = new Request(); //экземпляр класса Request

    }
}
