package Classes;

public class FruitTaste {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "Mango";
        fruit.color = "yellow";
        fruit.taste = "sweet";
        fruit.price = 2.65;

        fruit.eatFruit();
        fruit.buyFruit();

        Fruit fruit2 = new Fruit();
        fruit2.name = "Orange";
        fruit2.color = "orange";
        fruit2.taste = "sweet & sour";
        fruit2.price = 2.50;

        System.out.println(fruit2.taste);




    }
}
