class Animal {
    String type = "Animal";

    void eat() {
        System.out.println("Animal eats food");
    }
}

class superInheritance extends Animal {
    void display() {
        System.out.println(super.type);
        super.eat();
    }

    public static void main(String[] args) {
        superInheritance d = new superInheritance();
        d.display();
    }
}
