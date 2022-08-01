package AccessModifier.Interface; //Реагирование на событие клавиатуры page 160

import javax.swing.*;
import java.awt.event.*;

public class Keystrokes extends JFrame implements KeyListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    //интерфейс KeyListener распознает нажатие клавиш
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JTextField field = new JTextField(38); // объект принимает на вход числовое значение, определяющее размер текстового поля
    //При помощи класса JTextArea можно создавать многострочные текстовые поля.
    JTextArea txtArea = new JTextArea(5, 38); // Конструктор класса JTextArea принимает два числовых значения, определяющих число строк и ширину поля

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Keystrokes() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(field); //добавили компонент JTextField
        pnl.add(txtArea); //добавляем компонент JTextArea в контейнер JPanel

        field.addKeyListener(this);  //метод addKeyListener() из интерфейса KeyListener генерирует событие при нажатии клавиш. В качестве аргумента передается слово this

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public void keyPressed(KeyEvent event) { //метод keyPressed(KeyEvent event) обрабатывает события интерфейса KeyListener(распознает нажатие клавиш)
        txtArea.setText("Нажата клавиша");
    }

    public void keyTyped(KeyEvent event) { //метод keyTyped(KeyEvent event) обрабатывает события интерфейса KeyListener(отображает символ клавиши после ее нажатия(с учетом установленной раскладки языка))
        txtArea.append("\nСимвол: " + event.getKeyChar()); //метод getKeyChar() возвращает символ соответствующий нажатой клавише
    }

    public void keyReleased(KeyEvent event) { //метод keyReleased(KeyEvent event) отображает код клавиши и текст(на англ. раскладке), когда клавиша отпущена
        int keyCode = event.getKeyCode(); //метод getKeyCode() возвращает код клавиши(в случае если вызван обработчик keyPressed() или keyReleased(), но не keyTyped)
        txtArea.append("\nКод клавиши: " + event.getKeyCode());
        txtArea.append("\nТекст клавиши: " + event.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        Keystrokes gui = new Keystrokes(); //экземпляр класса Keystrokes

    }
}
