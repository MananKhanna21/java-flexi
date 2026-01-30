class staticVar {
    static String college = "Symbiosis Institute of Technology";
    String name;
    int roll;

    staticVar(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(college);
    }

    public static void main(String[] args) {
        staticVar s = new staticVar("Manan", 101);
        s.display();
    }
}
