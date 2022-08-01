package AccessModifier.Interface;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse extends JFrame implements MouseListener, MouseMotionListener { //класс JFrame позволяет наследовать атрибуты и методы для работы с окном: перемещать, изменять размер и закрывать
    JPanel pnl = new JPanel(); //контейнер JPanel - компонент окна

    //При помощи класса JTextArea можно создавать многострочные текстовые поля.
    JTextArea txtArea = new JTextArea(8, 38); // Конструктор класса JTextArea принимает два числовых значения, определяющих число строк и ширину поля
    int x, y;

    /*Конструктор с указанием параметров окна и добавлением объекта JPanel к классу JFrame*/
    public Mouse() {
        super("Окно Swing"); //заголовок окна
        setSize(500, 200); //размер окна (в пикселях)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE - константа, производит выход из программы
        add(pnl); //при помощи метода add() добавляются более мелкие компоненты к контейнеру JPanel

        pnl.add(txtArea); //добавляем компонент JTextArea в контейнер JPanel
        txtArea.addMouseMotionListener(this); //метод addMouseMotionListener() из интерфейса MouseMotionListener распознает движение мыши. В качестве аргумента передается слово this
        txtArea.addMouseListener(this); //метод addMouseListener() из интерфейса MouseListener распознает действие мыши. В качестве аргумента передается слово this

        setVisible(true); //параметр отображения окна, true = видимый
    }
/* обработчики событий интерфейса MouseMotionListener */
    public void mouseMoved(MouseEvent event) { //метод mouseMoved(MouseEvent event) отслеживает перемещение указателя
        x = event.getX();
        y = event.getY();
    }

    public void mouseDragged(MouseEvent event) {} //метод mouseDragged(MouseEvent event) отслеживает перетаскивание(с нажатой кнопкой)

/* обработчики событий интерфейса MouseListener */
    public void mouseEntered(MouseEvent event) { //метод mouseEntered(MouseEvent event) отслеживает вхождение курсора в область
        txtArea.setText("\nНажата кнопка мыши");
    }

    public void mousePressed(MouseEvent event) { //метод mousePressed(MouseEvent event) отслеживает нажатие кнопки мыши
        txtArea.append("\nКнопка нажата, когда указатель в позиции X: " + x + "Y:" + y);
    }

    public void mouseReleased(MouseEvent event) { //метод mouseReleased(MouseEvent event) отслеживает освобождение кнопки мыши
        txtArea.append("\nКнопка мыши отпущена");
    }

    public void mouseClicked(MouseEvent event) { //метод mouseClicked(MouseEvent event) отслеживает щелчок кнопки мыши
        txtArea.append("\nКнопка мыши щелкнула");
    }

    public void mouseExited(MouseEvent event) { //метод mouseExited(MouseEvent event) отслеживает выход указателя из области
        txtArea.append("\nКнопка вышла из области");
    }

    public static void main(String[] args) {
        Mouse gui = new Mouse(); //экземпляр класса Mouse

    }
}
