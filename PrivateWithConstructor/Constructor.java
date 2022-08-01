package AccessModifier.PrivateWithConstructor;

public class Constructor {
    public static void main(String[] args) {
        Car2 Porshe2 = new Car2();
        Porshe2.getCar1(); //ывод первоначальных значений по умолчаню из конструктора Car2

        Car2 Ferrari2 = new Car2();
        Ferrari2.setCar2("Ferrari2", "Красный", "Спортивный");
        Ferrari2.getCar1();
    }
}
