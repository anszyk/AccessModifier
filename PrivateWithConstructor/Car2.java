package AccessModifier.PrivateWithConstructor; //создание объектных данных 115 page

public class Car2 {
    private String maker2;
    private String color2;
    private String bodyType2;

    public Car2() { //конструктор, в котором инициализируются переменные со значениями атрибутов
        maker2 = "Porshe2";
        color2 = "Серебристый2";
        bodyType2 = "Купе2";
    }

    private String accelerate2() {
        String motion2 = "Ускоряется2...";
        return motion2;
    }

    public void setCar2(String brand2, String paint2, String style2) {//общедоступный метод для присваивания значения переданного аргумента каждой из из закрытых переменных
        maker2 = brand2;
        color2 = paint2;
        bodyType2 = style2;
    }

    public void getCar1() { //общедоступный метод, обращающийся к значениям закрытых переменных и вызывающий закрытытй метод
        System.out.println(maker2 + " цвет " + color2);
        System.out.println(maker2 + " тип кузова " + bodyType2);
        System.out.println(maker2 + " " + accelerate2() + "\n");
    }

}
