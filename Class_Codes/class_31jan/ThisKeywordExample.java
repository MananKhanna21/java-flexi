/*class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student s = new Student("Alice");
        s.display();
    }
}
*/
class Parent {
    void display(){
        System.out.println("This is the Parent class");
    }
}
class Child extends Parent {
    void display(){
        super.display();
        System.out.println("This is the Child class");
    }
   
}
public class ThisKeywordExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}