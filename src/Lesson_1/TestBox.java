package Lesson_1;

public class TestBox {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange(1.8f);
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple(1.5f);


        BoxFruit<Orange> orangeBoxOfFruit = new BoxFruit<>();
        BoxFruit<Orange> orangeBoxOfFruit2 = new BoxFruit<>();
        BoxFruit<Apple> appleBoxOfFruit = new BoxFruit<>();

        orangeBoxOfFruit.addToBox(orange3);
        orangeBoxOfFruit.addToBox(orange2);
        orangeBoxOfFruit.addToBox(orange4);
        orangeBoxOfFruit2.addToBox(orange1);
        orangeBoxOfFruit2.addToBox(orange5);

        System.out.println("Вес первой коробки апельсинов:" + orangeBoxOfFruit.getWeight());
        System.out.println("Вес второй коробки апельсинов: " + orangeBoxOfFruit2.getWeight());

        appleBoxOfFruit.addToBox(apple1);
        appleBoxOfFruit.addToBox(apple2);
        appleBoxOfFruit.addToBox(apple3);
        appleBoxOfFruit.addToBox(apple4);
        appleBoxOfFruit.addToBox(apple5);
        System.out.println("Вес коробки яблок: " + appleBoxOfFruit.getWeight());

        System.out.println("Равен ли вес двух коробок апельсинов: " + orangeBoxOfFruit.compare(orangeBoxOfFruit2));
        orangeBoxOfFruit.MoveTo(orangeBoxOfFruit2);

        System.out.println("Апелсины пересыпали, вес первой коробки апельсинов: " + orangeBoxOfFruit.getWeight());
        System.out.println("Вес второй коробки апельсинов: " + orangeBoxOfFruit2.getWeight());

    }
}
