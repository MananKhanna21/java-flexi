class Student{
    String name;
    int age;
    Student(){
        name="Manan";
        age=20;
    }
    Student(String n, int a){
        name=n;
        age=a;

    }
    void display(){
        System.out.println("Name: "+ name + " Age: "+ age);
    }
}
public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Student s2=new Student("Manan", 22);
        s2.display();
    }
}
