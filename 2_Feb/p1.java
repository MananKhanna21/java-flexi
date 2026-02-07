class Parent {
    final int x = 100;

    final void display() {
        System.out.println("Final Method in Parent Class");
    }
}

final class p1 extends Parent {
    void show() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        p1 c = new p1();
        c.display();
        c.show();
    }
}
