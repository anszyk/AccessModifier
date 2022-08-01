package AccessModifier.Public;

public class FirstInstance {
    public static void main(String[] args) {
        System.out.println("Цвет автомобиля " + Car.color);
        System.out.println("Тип кузова " + Car.bodyType);
        System.out.println(Car.accelerate());
        Car Porsche = new Car();
        System.out.println("Цвет Porsche " + Porsche.color); //объекту Porsche можно обратиться к переменной color, потому что метод и поля супер-класса статические
        System.out.println("Тип кузова Porsche " + Porsche.bodyType);//объекту Porsche можно обратиться к переменной bodyType, потому что метод и поля супер-класса статические
        System.out.println(Porsche.accelerate());//объекту Porsche можно обратиться к методу accelerate(), потому что метод и поля супер-класса статические
    }
}