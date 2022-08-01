package AccessModifier.Interface; //Воспроизведение звука page 168

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sound extends JFrame implements ActionListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    //интерфейс ActionListener генерирует событие при нажатии на кнопку
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    ClassLoader ldr = this.getClass().getClassLoader(); //создали объект ClassLoader

    java.applet.AudioClip audio = JApplet.newAudioClip(ldr.getResource("audio.wav")); //Класс AudioClip содержит методы для проигрывания аудиофайлов. Файл должен находиться в папке src
    // Класс JApplet поддерживает совместимость с компонентами библиотеки Swing. Метод newAudioClip() возвращает URL-адрес аудиофайла.
    // Метод getResource() объекта ClassLoader загружает аудиофайл в качестве ресурса в объект AudioClip

    JButton playBtn = new JButton("Играть");
    JButton stopBtn = new JButton("Стоп");

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Sound() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(playBtn); //добавление компонентов JButton на контейнер JPanel
        pnl.add(stopBtn);

        playBtn.addActionListener(this); //метод addActionListener() из интерфейса ActionListener генерирует событие при нажатии на кнопку. В качестве аргумента передается слово this
        stopBtn.addActionListener(this);

        setVisible(true); //параметр отображения окна, true = видимый
    }

    public void actionPerformed(ActionEvent event) { //метод actionPerformed(ActionEvent event) - обработчик событий
        if (event.getSource() == playBtn) //метод getSource() идентифицирует исходный компонент, являющийся инициатором событий
            audio.play(); //метод play() воспроизводит аудио
        if (event.getSource() == stopBtn)
            audio.stop(); //метод stop() останавливает воспроизведение аудио
    }

    public static void main(String[] args) {
        Sound gui = new Sound(); //экземпляр класса Sound

    }
}
