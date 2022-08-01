package AccessModifier.DeployingPrograms; //Создание апплетов page 182
//апплеты не содержат метод main - вместо него они используют метод init()
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class LottoApplet extends JApplet implements ActionListener { //класс JApplet позволяет наследовать атрибуты и методы для работы со страницей веб-браузера
    //интерфейс ActionListener генерирует событие при нажатии на кнопку

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
    public void init() {
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(img); //добавили компонент JLabel
        pnl.add(txt); //добавили компонент JTextField
        pnl.add(btn); //добавили компонент JButton

        /*задаем цвет фона с помощью шестнадцатеричного параметра кода HTML */
        String bgStr = getParameter("BgColor");
        int bgHex = Integer.parseInt(bgStr, 16);
        pnl.setBackground(new Color(bgHex));

        btn.addActionListener(this);  //метод addActionListener() из интерфейса ActionListener генерирует событие при нажатии на кнопку. В качестве аргумента передается слово this
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
}
