package AccessModifier.Interface; //Добавление текстовых полей page 142
// Класс JTextField создает компонент графического интерфейса(однострочное текстовое поле). Компонент отображает на экране редактируемый текст
// Если надо скрыть вводимые символы то, вместо класса JTextField используется JPasswordField

import javax.swing.*;

public class TextFields extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JTextField txt1 = new JTextField(38); // объект принимает на вход числовое значение, определяющее размер текстового поля
    JTextField txt2 = new JTextField("Текст по умолчанию", 38); // объект принимает на вход строковый аргумент, задающий текст по умолчанию и числовое значение, определяющее размер текстового поля

    //При помощи класса JTextArea можно создавать многострочные текстовые поля.
    JTextArea txtArea = new JTextArea(5, 37); // Конструктор класса JTextArea принимает два числовых значения, определяющих число строк и ширину поля

    JScrollPane pane = new JScrollPane(txtArea); // класс JScrollPane добавляет скроллбар, конструктор принимает аргументом имя объекта JTextArea(имя - txtArea)

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public TextFields() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        txtArea.setLineWrap(true); //методы setLineWrap() и setWrapStyleWord() используются для переноса слов (подгоняется ширина вводимого текста)
        txtArea.setWrapStyleWord(true);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Оператор для постоянного отображения вертикальной полосы прокрутки объекта JTextArea.
        // Метод setVerticalScrollBarPolicy() принимает аргументом константу контейнера JScrollPane. КОМПОНЕНТ JTextArea не имеет возможности прокрутки пока его не поместить в компонент JScrollPane
        pnl.add(txt1); //добавили компонент JTextField
        pnl.add(txt2);
        pnl.add(pane); // добавили контейнер JScrollPane

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        TextFields gui = new TextFields(); //экземпляр класса TextFields

    }
}
