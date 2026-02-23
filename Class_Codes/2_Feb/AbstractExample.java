/*abstract class Shape{
    abstract void draw();

    void message(){
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle.");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();
        c.message();
    }
}
    */
abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks.");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
        animal.eat();                          
    }
}