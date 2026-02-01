class Parent {
    int x = 10;
}

class this_super extends Parent {
    int x = 20;

    void display() {
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        this_super c = new this_super();
        c.display();
    }
}
