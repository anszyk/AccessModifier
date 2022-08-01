package AccessModifier.Interface; //Обработка событий элементов page 158

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class States extends JFrame implements ItemListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    //интерфейс ItemListener распознает событие элемента при его выборе или отмене выбора элемента
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    String[] styles = {" В глубокой форме", " Для гурманов", " Тонкая"};

    JComboBox<String> box = new JComboBox<>(styles); // Класс JComboBox создает выпадающий список элементов(выбрать можно один элемент). Конструктор принимает на вход имя строкового массива
    JRadioButton rad1 = new JRadioButton("Белое"); // Класс создает JRadioButton компонент "переключатель".
    JRadioButton rad2 = new JRadioButton("Красное"); // Конструктор принимает на вход текст и/или логический аргумент true(выбор по умолчанию)
    ButtonGroup wines = new ButtonGroup(); //объединяем переключатели(из группы может быть выбран только один)
    JCheckBox chk = new JCheckBox("Пеперони"); // Класс JCheckBox добавляет "флажок". Конструктор принимает аргументом строковый аргумент и/или логическое значение true - выбор по умолчанию
    //При помощи класса JTextArea можно создавать многострочные текстовые поля.
    JTextArea txtArea = new JTextArea(5, 38); // Конструктор класса JTextArea принимает два числовых значения, определяющих число строк и ширину поля

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public States() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        wines.add(rad1); //добавляем компонент JRadioButton в группу ButtonGroup
        wines.add(rad2);

        pnl.add(rad1); //добавляем компонент JRadioButton в контейнер JPanel
        pnl.add(rad2);
        pnl.add(chk); //добавляем компонент JCheckBox в контейнер JPanel
        pnl.add(box); //добавляем компонент JComboBox в контейнер JPanel
        pnl.add(txtArea); //добавляем компонент JTextArea в контейнер JPanel

        rad1.addItemListener(this); //метод addItemListener() из интерфейса ItemListener генерирует событие при выборе или отмене элемента. В качестве аргумента передается слово this
        rad2.addItemListener(this);
        chk.addItemListener(this);
        box.addItemListener(this);


        setVisible(true); //параметр отображения окна, true = видимый
    }

    public void itemStateChanged(ItemEvent event) { //метод itemStateChanged(ItemEvent event) обрабатывает события интерфейса ItemListener
        if (event.getItemSelectable() == rad1) // метод getItemSelectable() идентифицирует компонент, вызвавший событие
            txtArea.setText("Выбрано белое вино"); //метод setText() помещает строковое значение из аргумента в многострочное текстовое поле
        if (event.getItemSelectable() == rad2)
            txtArea.setText("Выбрано красное вино");
        /*определяем статус компонента JCheckBox(chk)*/
        if ((event.getItemSelectable() == chk) &&
        (event.getStateChange() == ItemEvent.SELECTED)) //метод getStateChange() возвращает состояние компонента и сравнивает с константой ItemEvent.SELECTED
            txtArea.append("\nВыбрана Пеперони\n"); //метод append() добавляет текст в текстовую область
        /*определяем статус компонента JComboBox(box)*/
        if ((event.getItemSelectable() == box) &&
                (event.getStateChange() == ItemEvent.SELECTED))
            txtArea.append("Выбрана" + event.getItem().toString());
    }

    public static void main(String[] args) {
        States gui = new States(); //экземпляр класса States

    }
}
