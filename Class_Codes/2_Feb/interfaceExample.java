interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks.");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
    }
}