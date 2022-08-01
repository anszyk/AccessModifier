package AccessModifier.Private; //Инкапсуляция свойств 113 page

public class Car1 {
    private String maker1;
    private String color1;
    private String bodyType1;

    private String accelerate1() {
        String motion1 = "Ускоряется1...";
        return motion1;
    }
    public void setCar1(String brand1, String paint1, String style1) { //общедоступный метод для присваивания значения переданного аргумента каждой из из закрытых переменных
        maker1 = brand1;
        color1 = paint1;
        bodyType1 = style1;
    }
    public void getCar1() { //общедоступный метод, обращающийся к значениям закрытых переменных и вызывающий закрытытй метод
        System.out.println(maker1 + " цвет " + color1);
        System.out.println(maker1 + " тип кузова " + bodyType1);
        System.out.println(maker1 + " " + accelerate1() + "\n");
    }
}
