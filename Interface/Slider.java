package AccessModifier.Interface;

import javax.swing.*;

public class Slider extends JFrame { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    JSlider sld = new JSlider(0, 100); // Класс создает JSlider компонент "ползунок". Конструктор принимает на вход мин и макс значение


    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Slider() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        sld.setOrientation(JSlider.HORIZONTAL); //ставим ползунок горизонтально
        sld.setMajorTickSpacing(50);//Определение расстояния для прорисовки больших делений или меток, если они выводятся
        sld.setMinorTickSpacing(5); //Определение расстояния для прорисовки промежуточных делений. Желательно выбирать значение так, чтобы между большими делениями было кратное количество маленьких делений
        sld.setPaintTicks(true); //Включение или отключение прорисовки делений

        sld.setPaintLabels(true); //Включение или отключение прорисовки шкалы

        pnl.add(sld); //добавляем компонент JSlider в контейнер JPanel

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public static void main(String[] args) {
        Slider gui = new Slider(); //экземпляр класса Slider

    }
}
