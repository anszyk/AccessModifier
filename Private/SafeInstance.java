package AccessModifier.Private;

public class SafeInstance {
    public static void main(String[] args) {
        Car1 Porsche1 = new Car1();
        Porsche1.setCar1("Porsche1", "Красный1", "Купе1"); //вызов общедоступного метода для присваивания значений закрытым переменным. Вызываем метод set перед get, иначе проинициализированная переменная даст null
        Porsche1.getCar1(); //вызов общедоступного метода, вызывающего сохраненные значения закрытых переменных

        Car1 Bentley1 = new Car1();
        Bentley1.setCar1("Bentley1", "Зеленый1", "Седан1"); //вызов общедоступного метода для присваивания значений закрытым переменным. Вызываем метод set перед get, иначе проинициализированная переменная даст null
        Bentley1.getCar1(); //вызов общедоступного метода, вызывающего сохраненные значения закрытых переменных
    }

}
