package AccessModifier.Public; //создание экземпляра объекта 111 page

public class Car {
    public final static String color = "Красный";
    public final static String bodyType = "Купе";

    public static String accelerate() {
        String motion = "Ускоряется...";
        return motion;
    }

}
