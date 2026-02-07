interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

class diamond implements A, B {
    public void show() {
        A.super.show();
        B.super.show();
    }

    public static void main(String[] args) {
        diamond obj = new diamond();
        obj.show();
    }
}
