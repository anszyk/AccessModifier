package AccessModifier.DeployingPrograms; //Методы развертывания page 172

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Lotto extends JFrame implements ActionListener {

    //компоненты
    //объект ClassLoader загружает изображения (необходимо в случае распространения программы в виде одиночного Java-архива(JAR))
    ClassLoader ldr = this.getClass().getClassLoader(); //создали объект ClassLoader

    URL iconURL = ldr.getResource("Lotto.png"); //методу getResource() указывается имя файла или путь,
    // в результате будет возвращаться адрес URL, который используется в качестве аргумента для конструктора ImageIcon
    ImageIcon icon = new ImageIcon(iconURL); //создали объект изображения

    /*В интерфейс можно добавлять объект "метки" при помощи класса JLabel. Элемент используется для отображения неизменяемого изображения и/или текста*/
    JLabel img = new JLabel(icon); //объект для вывода изображения
    JTextField txt = new JTextField("", 18); // объект принимает на вход строковый аргумент, задающий текст по умолчанию и числовое значение, определяющее размер текстового поля
    JButton btn = new JButton("Показать счастливые номера"); // в качестве аргумента конструктору JButton можно указать два аргумента - строку и имя объекта ImageIcon
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    //Конструктор
    public Lotto() {
        super("Приложение Lotto"); //заголовок окна
        setSize(260, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(img); //добавили компонент JLabel
        pnl.add(txt); //добавили компонент JTextField
        pnl.add(btn); //добавили компонент JButton

        btn.addActionListener(this);  //метод addActionListener() из интерфейса ActionListener генерирует событие при нажатии на кнопку. В качестве аргумента передается слово this
        setVisible(true); //параметр отображения окна, true = видимый
    }

    //Обработчик событий
    public void actionPerformed(ActionEvent event) { //метод actionPerformed(ActionEvent event) - обработчик событий
        if (event.getSource() == btn) { //метод getSource() идентифицирует исходный компонент, являющийся инициатором событий
            int[] nums = new int[50];
            String str = "";
            for (int i = 1; i < 50; i++) { //заполняем массив числами [1;49]
                nums[i] = i; //где значение ячейки массива == значению переменной цикла
            }
            for (int i = 1; i < 50; i++) { //берем прошлые значения цикла
                 int r = (int) (49 * Math.random() + 1); //перемешиваем все числа в массиве
                 int temp = nums[i];
                 nums[i] = nums[r];
                 nums[r] = temp;
            }
            for (int i = 1; i < 7; i++) { //выбираем первые шесть(6) чисел из массива
                str += " " + Integer.toString(nums[i]) + " "; //заносим выбранные значения в строковый массив
            }
            txt.setText(str); //массив str помещаем в строку txt
        }
    }
    //Точка входа
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
    }
}

