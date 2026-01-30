class A {
    int x = 10;
}

class B {
    int y = 20;
}

class three_class {
    int z = 30;

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        System.out.println(obj1.x);
        System.out.println(obj2.y);
        System.out.println(obj3.z);
    }
}
